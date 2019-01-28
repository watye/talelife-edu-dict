package com.talelife.edu.dict.web.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

/**
 * 课程
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-01-28 17:10:13
 */
public class CourseQuery implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Long courseId;
	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Long parentCourseId;
	/**
	 * 分类名称
	 */
	@ApiModelProperty(value = "分类名称")
	private String courseName;
	/**
	 * 序号
	 */
	@ApiModelProperty(value = "序号")
	private Integer sort;
	/**
	 * 费用（分）
	 */
	@ApiModelProperty(value = "费用（分）")
	private Integer expense;

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setParentCourseId(Long parentCourseId) {
		this.parentCourseId = parentCourseId;
	}
	public Long getParentCourseId() {
		return parentCourseId;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getSort() {
		return sort;
	}
	public void setExpense(Integer expense) {
		this.expense = expense;
	}
	public Integer getExpense() {
		return expense;
	}
}
