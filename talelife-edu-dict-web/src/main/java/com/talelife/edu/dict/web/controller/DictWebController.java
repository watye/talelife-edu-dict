package com.talelife.edu.dict.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.talelife.framework.entity.Page;
import com.talelife.framework.entity.PageQueryParameter;
import com.talelife.framework.entity.ResponseEntity;
import com.talelife.framework.util.BeanUtils;
import com.talelife.framework.controller.BaseController;
import com.talelife.edu.dict.web.dto.DictDto;
import com.talelife.edu.dict.dao.entity.Dict;
import com.talelife.edu.dict.web.service.DictWebService;
import com.talelife.edu.dict.web.vo.DictAdd;
import com.talelife.edu.dict.web.vo.DictQuery;
import com.talelife.edu.dict.web.vo.DictUpdate;

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

	@ApiOperation(value = "分页查询")
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ResponseEntity<Page<DictDto>> page(@Validated PageQueryParameter<DictQuery> pageQuery) {
		Dict dict = BeanUtils.map(pageQuery.getQuery(), Dict.class);
		PageInfo<Dict> page = dictWebService.findListPage(dict,pageQuery.getPageNum(), pageQuery.getPageSize());
		List<DictDto> dictList = BeanUtils.mapAsList(page.getList(), Dict.class, DictDto.class);
		return ResponseEntity.ok(new Page<DictDto>(page,dictList));
	}

	@ApiOperation(value = "查询单个")
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<DictDto> getDict(@PathVariable @ApiParam(value="用户id") Long id) {
		Dict dict = dictWebService.getById(id);
		return ResponseEntity.ok(BeanUtils.map(dict, DictDto.class));
	}

	@ApiOperation(value = "新增")
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public ResponseEntity<Object> add(@Validated DictAdd dictAdd) {
		dictWebService.save(BeanUtils.map(dictAdd,Dict.class));
		return ResponseEntity.ok();
	}

	@ApiOperation(value = "修改")
	@RequestMapping(value="/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Object> update(@PathVariable Long id,DictUpdate dictUpdate) {
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
