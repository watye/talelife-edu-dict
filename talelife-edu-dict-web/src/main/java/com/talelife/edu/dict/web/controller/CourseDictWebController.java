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
import com.talelife.edu.dict.web.dto.CourseDictDto;
import com.talelife.edu.dict.dao.entity.CourseDict;
import com.talelife.edu.dict.web.service.CourseDictWebService;
import com.talelife.edu.dict.web.vo.CourseDictAdd;
import com.talelife.edu.dict.web.vo.CourseDictQuery;
import com.talelife.edu.dict.web.vo.CourseDictUpdate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 课程单词
 * @author lwy
 *
 */
@Api(value="controller")
@RestController
@RequestMapping("/web/courseDict")
public class CourseDictWebController extends BaseController {
	@Resource
	private CourseDictWebService courseDictWebService;

	@ApiOperation(value = "分页查询")
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ResponseEntity<Page<CourseDictDto>> page(@Validated PageQueryParameter<CourseDictQuery> pageQuery) {
		CourseDict courseDict = BeanUtils.map(pageQuery.getQuery(), CourseDict.class);
		PageInfo<CourseDict> page = courseDictWebService.findListPage(courseDict,pageQuery.getPageNum(), pageQuery.getPageSize());
		List<CourseDictDto> courseDictList = BeanUtils.mapAsList(page.getList(), CourseDict.class, CourseDictDto.class);
		return ResponseEntity.ok(new Page<CourseDictDto>(page,courseDictList));
	}

	@ApiOperation(value = "查询单个")
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<CourseDictDto> getCourseDict(@PathVariable @ApiParam(value="用户id") Long id) {
		CourseDict courseDict = courseDictWebService.getById(id);
		return ResponseEntity.ok(BeanUtils.map(courseDict, CourseDictDto.class));
	}

	@ApiOperation(value = "新增")
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public ResponseEntity<Object> add(@Validated CourseDictAdd courseDictAdd) {
		courseDictWebService.save(BeanUtils.map(courseDictAdd,CourseDict.class));
		return ResponseEntity.ok();
	}

	@ApiOperation(value = "修改")
	@RequestMapping(value="/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Object> update(@PathVariable Long id,CourseDictUpdate courseDictUpdate) {
		courseDictWebService.updateById(BeanUtils.map(courseDictUpdate,CourseDict.class));
		return ResponseEntity.ok();
	}
	
	@ApiOperation(value = "删除")
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable @ApiParam(value="id") Long id) {
		courseDictWebService.deleteById(id);
		return ResponseEntity.ok();
	}

}
