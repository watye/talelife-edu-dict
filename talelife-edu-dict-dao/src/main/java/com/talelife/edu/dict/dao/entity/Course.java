package com.talelife.edu.dict.dao.entity;

import com.talelife.framework.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-01-28 17:10:13
 */
public class Course extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
		private Long courseId;
	/**
	 * 
	 */
	private Long parentCourseId;
	/**
	 * 分类名称
	 */
	private String courseName;
	/**
	 * 序号
	 */
	private Integer sort;
	/**
	 * 费用（分）
	 */
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
