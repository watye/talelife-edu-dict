package com.talelife.edu.dict.web.dto;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

/**
 * 单词
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-01-28 17:10:13
 */
public class DictDto implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Long dictId;
	/**
	 * 单词
	 */
	@ApiModelProperty(value = "单词")
	private String dictName;
	/**
	 * 美式音标
	 */
	private String usaSoundmark;
	/**
	 * 英式音标
	 */
	private String ukSoundmark;
	/**
	 * 美式发音地址
	 */
	@ApiModelProperty(value = "美式发音地址")
	private String usaPronounceUrl;
	/**
	 * 英式发音地址
	 */
	@ApiModelProperty(value = "英式发音地址")
	private String ukPronounceUrl;
	/**
	 * 中文意思
	 */
	private String chineseMeaning;
	/**
	 * 分类id
	 */
	private Long courseId;
	/**
	 * 序号
	 */
	private Integer sort;
	public String getUsaSoundmark() {
		return usaSoundmark;
	}
	public void setUsaSoundmark(String usaSoundmark) {
		this.usaSoundmark = usaSoundmark;
	}
	public String getUkSoundmark() {
		return ukSoundmark;
	}
	public void setUkSoundmark(String ukSoundmark) {
		this.ukSoundmark = ukSoundmark;
	}
	public String getChineseMeaning() {
		return chineseMeaning;
	}
	public void setChineseMeaning(String chineseMeaning) {
		this.chineseMeaning = chineseMeaning;
	}
	public void setDictId(Long dictId) {
		this.dictId = dictId;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Long getDictId() {
		return dictId;
	}
	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
	public String getDictName() {
		return dictName;
	}
	public void setUsaPronounceUrl(String usaPronounceUrl) {
		this.usaPronounceUrl = usaPronounceUrl;
	}
	public String getUsaPronounceUrl() {
		return usaPronounceUrl;
	}
	public void setUkPronounceUrl(String ukPronounceUrl) {
		this.ukPronounceUrl = ukPronounceUrl;
	}
	public String getUkPronounceUrl() {
		return ukPronounceUrl;
	}
}
