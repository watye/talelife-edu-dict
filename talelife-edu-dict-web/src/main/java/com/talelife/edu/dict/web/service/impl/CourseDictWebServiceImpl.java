package com.talelife.edu.dict.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talelife.framework.mapper.CrudMapper;
import com.talelife.framework.service.CrudServiceImpl;
import com.talelife.edu.dict.dao.CourseDictMapper;
import com.talelife.edu.dict.dao.entity.CourseDict;
import com.talelife.edu.dict.web.service.CourseDictWebService;

@Service
public class CourseDictWebServiceImpl extends CrudServiceImpl<CourseDict> implements CourseDictWebService {
	@Autowired
	private CourseDictMapper mapper;

	@Override
	public CrudMapper<CourseDict> getDao() {
		return this.mapper;
	}
}
