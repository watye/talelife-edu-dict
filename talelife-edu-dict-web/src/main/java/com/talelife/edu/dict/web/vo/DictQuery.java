package com.talelife.edu.dict.web.vo;

import java.io.Serializable;

/**
 * 单词
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-01-28 17:10:13
 */
public class DictQuery implements Serializable{

	private static final long serialVersionUID = -1238583096482402543L;

	/**
	 * 单词
	 */
	private String dictName;

	/**
	 * 单词
	 */
	private Long courseId;

	public String getDictName() {
		return dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

}
