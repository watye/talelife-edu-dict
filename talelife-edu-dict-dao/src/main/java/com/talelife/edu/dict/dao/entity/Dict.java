package com.talelife.edu.dict.dao.entity;

import com.talelife.framework.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/**
 * 单词
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-01-28 17:10:13
 */
public class Dict extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
		private Long dictId;
	/**
	 * 单词
	 */
	private String dictName;
	/**
	 * 美式发音地址
	 */
	private String usaPronounceUrl;
	/**
	 * 英式发音地址
	 */
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
