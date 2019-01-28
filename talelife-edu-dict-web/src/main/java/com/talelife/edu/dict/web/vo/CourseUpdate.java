package com.talelife.edu.dict.web.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
/**
 * 课程
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-01-28 17:10:13
 */
public class CourseUpdate implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@NotNull(message = "不能为空")
			@ApiModelProperty(value = "")
	private Long courseId;
	/**
	 * 
	 */
	@NotNull(message = "不能为空")
			@ApiModelProperty(value = "")
	private Long parentCourseId;
	/**
	 * 分类名称
	 */
		@NotBlank(message="分类名称不能为空")
	@Length(max = 50,message = "分类名称最大50个字符")
	@ApiModelProperty(value = "分类名称")
	private String courseName;
	/**
	 * 序号
	 */
	@NotNull(message = "序号不能为空")
			@ApiModelProperty(value = "序号")
	private Integer sort;
	/**
	 * 费用（分）
	 */
	@NotNull(message = "费用（分）不能为空")
			@ApiModelProperty(value = "费用（分）")
	private Integer expense;

	/**
	 * 设置：
	 */
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	/**
	 * 获取：
	 */
	public Long getCourseId() {
		return courseId;
	}
	/**
	 * 设置：
	 */
	public void setParentCourseId(Long parentCourseId) {
		this.parentCourseId = parentCourseId;
	}
	/**
	 * 获取：
	 */
	public Long getParentCourseId() {
		return parentCourseId;
	}
	/**
	 * 设置：分类名称
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * 获取：分类名称
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * 设置：序号
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取：序号
	 */
	public Integer getSort() {
		return sort;
	}
	/**
	 * 设置：费用（分）
	 */
	public void setExpense(Integer expense) {
		this.expense = expense;
	}
	/**
	 * 获取：费用（分）
	 */
	public Integer getExpense() {
		return expense;
	}
}
