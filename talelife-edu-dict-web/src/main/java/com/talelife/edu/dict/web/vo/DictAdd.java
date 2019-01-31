package com.talelife.edu.dict.web.vo;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
/**
 * 单词
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-01-28 17:10:13
 */
public class DictAdd implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@NotNull(message = "课程不能为空")
	private Long courseId;
	/**
	 * 单词
	 */
		@NotBlank(message="单词不能为空")
	@Length(max = 50,message = "单词最大50个字符")
	@ApiModelProperty(value = "单词")
	private String dictName;
	/**
	 * 英式音标
	 */
	@NotBlank(message="英式音标不能为空")
	private String ukSoundmark;
	/**
	 * 美式音标
	 */
	@NotBlank(message="美式音标不能为空")
	private String usaSoundmark;
	/**
	 * 美式发音地址
	 */
		@NotBlank(message="美式发音地址不能为空")
	@Length(max = 50,message = "美式发音地址最大50个字符")
	@ApiModelProperty(value = "美式发音地址")
	private String usaPronounceUrl;
	/**
	 * 英式发音地址
	 */
		@NotBlank(message="英式发音地址不能为空")
	@Length(max = 50,message = "英式发音地址最大50个字符")
	@ApiModelProperty(value = "英式发音地址")
	private String ukPronounceUrl;

	/**
	 * 序号
	 */
	@NotNull(message="序号不能为空")
	private Integer sort;

	/**
	 * 中文意思
	 */
	@NotBlank(message="中文意思不能为空")
	private String chineseMeaning;
	
	/**
	 * 设置：单词
	 */
	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	/**
	 * 获取：单词
	 */
	public String getDictName() {
		return dictName;
	}
	/**
	 * 设置：美式发音地址
	 */
	public void setUsaPronounceUrl(String usaPronounceUrl) {
		this.usaPronounceUrl = usaPronounceUrl;
	}
	/**
	 * 获取：美式发音地址
	 */
	public String getUsaPronounceUrl() {
		return usaPronounceUrl;
	}
	/**
	 * 设置：英式发音地址
	 */
	public void setUkPronounceUrl(String ukPronounceUrl) {
		this.ukPronounceUrl = ukPronounceUrl;
	}
	/**
	 * 获取：英式发音地址
	 */
	public String getUkPronounceUrl() {
		return ukPronounceUrl;
	}
	public String getUkSoundmark() {
		return ukSoundmark;
	}
	public void setUkSoundmark(String ukSoundmark) {
		this.ukSoundmark = ukSoundmark;
	}
	public String getUsaSoundmark() {
		return usaSoundmark;
	}
	public void setUsaSoundmark(String usaSoundmark) {
		this.usaSoundmark = usaSoundmark;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getChineseMeaning() {
		return chineseMeaning;
	}
	public void setChineseMeaning(String chineseMeaning) {
		this.chineseMeaning = chineseMeaning;
	}
}
