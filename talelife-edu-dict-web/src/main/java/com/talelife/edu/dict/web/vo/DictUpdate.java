package com.talelife.edu.dict.web.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
/**
 * 单词
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-01-28 17:10:13
 */
public class DictUpdate implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@NotNull(message = "不能为空")
			@ApiModelProperty(value = "")
	private Long dictId;
	/**
	 * 单词
	 */
		@NotBlank(message="单词不能为空")
	@Length(max = 50,message = "单词最大50个字符")
	@ApiModelProperty(value = "单词")
	private String dictName;
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
	 * 设置：
	 */
	public void setDictId(Long dictId) {
		this.dictId = dictId;
	}
	/**
	 * 获取：
	 */
	public Long getDictId() {
		return dictId;
	}
	/**
	 * 设置：单词
	 */
	public void setDictName(String dictName) {
		this.dictName = dictName;
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
}
