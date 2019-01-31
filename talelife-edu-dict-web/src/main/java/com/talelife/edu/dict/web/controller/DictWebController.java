package com.talelife.edu.dict.web.controller;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.talelife.edu.dict.dao.entity.CourseDict;
import com.talelife.edu.dict.dao.entity.Dict;
import com.talelife.edu.dict.web.dto.DictDto;
import com.talelife.edu.dict.web.service.CourseDictWebService;
import com.talelife.edu.dict.web.service.DictWebService;
import com.talelife.edu.dict.web.vo.DictAdd;
import com.talelife.edu.dict.web.vo.DictQuery;
import com.talelife.edu.dict.web.vo.DictUpdate;
import com.talelife.framework.controller.BaseController;
import com.talelife.framework.entity.Page;
import com.talelife.framework.entity.PageQueryParameter;
import com.talelife.framework.entity.ResponseEntity;
import com.talelife.framework.util.BeanUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 单词
 * @author lwy
 *
 */
@Api(value="controller")
@RestController
@RequestMapping("/web/dict")
public class DictWebController extends BaseController {
	@Resource
	private DictWebService dictWebService;
	@Resource
	private CourseDictWebService courseDictWebService;

	@ApiOperation(value = "分页查询")
	@PostMapping(value = "/page")
	public ResponseEntity<Page<DictDto>> page(@Validated @RequestBody PageQueryParameter<DictQuery> pageQuery) {
		Dict dict = BeanUtils.map(pageQuery.getQuery(), Dict.class);
		if(Objects.nonNull(pageQuery.getQuery().getCourseId())){
			CourseDict query = new CourseDict();
			query.setCourseId(pageQuery.getQuery().getCourseId());
			List<CourseDict> courseDicts = courseDictWebService.findList(query);
			dict.setDictIds(courseDicts.stream().map(CourseDict::getDictId).collect(Collectors.toList()));
			if(dict.getDictIds().isEmpty()){
				return ResponseEntity.ok(new Page<DictDto>());
			}
		}
		PageInfo<Dict> page = dictWebService.findListPage(dict,pageQuery.getPageNum(), pageQuery.getPageSize());
		List<DictDto> dictList = BeanUtils.mapAsList(page.getList(), Dict.class, DictDto.class);
		return ResponseEntity.ok(new Page<DictDto>(page,dictList));
	}

	@ApiOperation(value = "查询单个")
	@GetMapping(value="/{id}")
	public ResponseEntity<DictDto> getDict(@PathVariable @ApiParam(value="用户id") Long id) {
		Dict dict = dictWebService.getById(id);
		CourseDict query = new CourseDict();
		query.setDictId(dict.getDictId());
		CourseDict courseDict = courseDictWebService.get(query);
		DictDto dictDto = BeanUtils.map(dict, DictDto.class);
		dictDto.setCourseId(courseDict.getCourseId());
		dictDto.setSort(courseDict.getSort());
		return ResponseEntity.ok(dictDto);
	}

	@ApiOperation(value = "新增")
	@PostMapping(value="/add")
	public ResponseEntity<Object> add(@RequestBody @Validated DictAdd dictAdd) {
		dictWebService.save(dictAdd);
		return ResponseEntity.ok();
	}

	@ApiOperation(value = "修改")
	@PutMapping(value="/{id}")
	public ResponseEntity<Object> update(@PathVariable Long id,@RequestBody DictUpdate dictUpdate) {
		dictWebService.updateById(BeanUtils.map(dictUpdate,Dict.class));
		return ResponseEntity.ok();
	}
	
	@ApiOperation(value = "删除")
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable @ApiParam(value="id") Long id) {
		dictWebService.deleteById(id);
		return ResponseEntity.ok();
	}

}
