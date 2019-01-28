package com.talelife.edu.dict.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talelife.framework.mapper.CrudMapper;
import com.talelife.framework.service.CrudServiceImpl;
import com.talelife.edu.dict.dao.CourseMapper;
import com.talelife.edu.dict.dao.entity.Course;
import com.talelife.edu.dict.web.service.CourseWebService;

@Service
public class CourseWebServiceImpl extends CrudServiceImpl<Course> implements CourseWebService {
	@Autowired
	private CourseMapper mapper;

	@Override
	public CrudMapper<Course> getDao() {
		return this.mapper;
	}
}
