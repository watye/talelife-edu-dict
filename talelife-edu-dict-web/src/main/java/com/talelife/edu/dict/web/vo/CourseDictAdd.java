package com.talelife.edu.dict.web.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
/**
 * 课程单词
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-01-28 17:10:13
 */
public class CourseDictAdd implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@NotNull(message = "主键不能为空")
			@ApiModelProperty(value = "主键")
	private Long id;
	/**
	 * 分类id
	 */
	@NotNull(message = "分类id不能为空")
			@ApiModelProperty(value = "分类id")
	private Long courseId;
	/**
	 * 单词id
	 */
	@NotNull(message = "单词id不能为空")
			@ApiModelProperty(value = "单词id")
	private Long dictId;
	/**
	 * 序号
	 */
	@NotNull(message = "序号不能为空")
			@ApiModelProperty(value = "序号")
	private Integer sort;

	/**
	 * 设置：主键
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：分类id
	 */
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	/**
	 * 获取：分类id
	 */
	public Long getCourseId() {
		return courseId;
	}
	/**
	 * 设置：单词id
	 */
	public void setDictId(Long dictId) {
		this.dictId = dictId;
	}
	/**
	 * 获取：单词id
	 */
	public Long getDictId() {
		return dictId;
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
}
