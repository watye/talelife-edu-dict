package com.talelife.edu.dict.web.service;

import com.talelife.edu.dict.dao.entity.CourseDict;
import com.talelife.framework.service.CrudService;

public interface CourseDictWebService extends CrudService<CourseDict>{

	boolean updateByDictId(CourseDict courseDict);
}

