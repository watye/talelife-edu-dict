package com.talelife.edu.dict.dao.entity;

import com.talelife.framework.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程单词
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-01-28 17:10:13
 */
public class CourseDict extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
		private Long id;
	/**
	 * 分类id
	 */
	private Long courseId;
	/**
	 * 单词id
	 */
	private Long dictId;
	/**
	 * 序号
	 */
	private Integer sort;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getCourseId() {
		return courseId;
	}
	public void setDictId(Long dictId) {
		this.dictId = dictId;
	}

	public Long getDictId() {
		return dictId;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getSort() {
		return sort;
	}
}
