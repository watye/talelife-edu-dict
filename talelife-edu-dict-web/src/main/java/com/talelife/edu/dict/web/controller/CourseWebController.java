package com.talelife.edu.dict.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.talelife.edu.dict.dao.entity.Course;
import com.talelife.edu.dict.web.dto.CourseDto;
import com.talelife.edu.dict.web.service.CourseWebService;
import com.talelife.edu.dict.web.vo.CourseAdd;
import com.talelife.edu.dict.web.vo.CourseQuery;
import com.talelife.edu.dict.web.vo.CourseUpdate;
import com.talelife.framework.controller.BaseController;
import com.talelife.framework.entity.Page;
import com.talelife.framework.entity.PageQueryParameter;
import com.talelife.framework.entity.ResponseEntity;
import com.talelife.framework.entity.TreeNode;
import com.talelife.framework.util.BeanUtils;
import com.talelife.framework.util.TreeUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 课程
 * @author lwy
 *
 */
@Api(value="controller")
@RestController
@RequestMapping("/web/course")
public class CourseWebController extends BaseController {
	@Resource
	private CourseWebService courseWebService;

	@ApiOperation(value = "分页查询")
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ResponseEntity<Page<CourseDto>> page(@Validated PageQueryParameter<CourseQuery> pageQuery) {
		Course course = BeanUtils.map(pageQuery.getQuery(), Course.class);
		PageInfo<Course> page = courseWebService.findListPage(course,pageQuery.getPageNum(), pageQuery.getPageSize());
		List<CourseDto> courseList = BeanUtils.mapAsList(page.getList(), Course.class, CourseDto.class);
		return ResponseEntity.ok(new Page<CourseDto>(page,courseList));
	}

	@ApiOperation(value = "查询单个")
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<CourseDto> getCourse(@PathVariable @ApiParam(value="用户id") Long id) {
		Course course = courseWebService.getById(id);
		return ResponseEntity.ok(BeanUtils.map(course, CourseDto.class));
	}

	@ApiOperation(value = "新增")
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public ResponseEntity<Object> add(@Validated CourseAdd courseAdd) {
		courseWebService.save(BeanUtils.map(courseAdd,Course.class));
		return ResponseEntity.ok();
	}

	@ApiOperation(value = "修改")
	@RequestMapping(value="/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Object> update(@PathVariable Long id,CourseUpdate courseUpdate) {
		courseWebService.updateById(BeanUtils.map(courseUpdate,Course.class));
		return ResponseEntity.ok();
	}
	
	@ApiOperation(value = "删除")
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable @ApiParam(value="id") Long id) {
		courseWebService.deleteById(id);
		return ResponseEntity.ok();
	}

	@ApiOperation(value = "树")
	@GetMapping(value = "/tree")
	public ResponseEntity<List<TreeNode>> tree() {
		List<Course> courses = courseWebService.findList(new Course());
		List<TreeNode> treeNodes = new ArrayList<>();
		for (Course course : courses) {
			treeNodes.add(new TreeNode(course.getCourseId(),course.getParentCourseId(),course.getCourseName()));
		}
		return ResponseEntity.ok(TreeUtils.transformToTree(treeNodes));
	}
}
