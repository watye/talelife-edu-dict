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
	 * 美式发音地址
	 */
	@ApiModelProperty(value = "美式发音地址")
	private String usaPronounceUrl;
	/**
	 * 英式发音地址
	 */
	@ApiModelProperty(value = "英式发音地址")
	private String ukPronounceUrl;

	public void setDictId(Long dictId) {
		this.dictId = dictId;
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
