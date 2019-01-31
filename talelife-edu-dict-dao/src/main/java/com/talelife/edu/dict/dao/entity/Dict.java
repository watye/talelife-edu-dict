package com.talelife.edu.dict.dao.entity;

import java.util.List;

import com.talelife.framework.entity.BaseEntity;

/**
 * 单词
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-01-28 17:10:13
 */
public class Dict extends BaseEntity {

	private static final long serialVersionUID = 8035716223711826027L;
	/**
	 * 
	 */
		private Long dictId;
	/**
	 * 单词
	 */
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
	private String usaPronounceUrl;
	/**
	 * 英式发音地址
	 */
	private String ukPronounceUrl;
	/**
	 * 中文意思
	 */
	private String chineseMeaning;

	private List<Long> dictIds;
	
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

	public List<Long> getDictIds() {
		return dictIds;
	}

	public void setDictIds(List<Long> dictIds) {
		this.dictIds = dictIds;
	}
}
