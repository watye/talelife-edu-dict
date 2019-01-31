package com.talelife.edu.dict.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.talelife.framework.mapper.CrudMapper;
import com.talelife.framework.service.CrudServiceImpl;
import com.talelife.framework.util.BeanUtils;
import com.talelife.edu.dict.dao.DictMapper;
import com.talelife.edu.dict.dao.entity.CourseDict;
import com.talelife.edu.dict.dao.entity.Dict;
import com.talelife.edu.dict.web.service.CourseDictWebService;
import com.talelife.edu.dict.web.service.DictWebService;
import com.talelife.edu.dict.web.vo.DictAdd;
import com.talelife.edu.dict.web.vo.DictUpdate;

@Service
public class DictWebServiceImpl extends CrudServiceImpl<Dict> implements DictWebService {
	@Autowired
	private DictMapper mapper;
	@Autowired
	private CourseDictWebService courseDictWebService;

	@Override
	public CrudMapper<Dict> getDao() {
		return this.mapper;
	}

	@Override
	@Transactional
	public boolean save(DictAdd dictAdd) {
		Dict dict = BeanUtils.map(dictAdd,Dict.class);
		boolean r = save(dict);
		CourseDict courseDict = new CourseDict();
		courseDict.setCourseId(dictAdd.getCourseId());
		courseDict.setDictId(dict.getDictId());
		courseDict.setSort(dictAdd.getSort());
		courseDictWebService.save(courseDict);
		return r;
	}

	@Override
	@Transactional
	public boolean deleteById(Long id) {
		super.deleteById(id);
		CourseDict courseDict = new CourseDict();
		courseDict.setDictId(id);
		return courseDictWebService.delete(courseDict);
	}

	@Override
	@Transactional
	public boolean updateById(DictUpdate dictUpdate) {
		Dict dict = BeanUtils.map(dictUpdate,Dict.class);
		super.updateById(dict);
		CourseDict courseDict = new CourseDict();
		courseDict.setDictId(dictUpdate.getDictId());
		courseDict.setCourseId(dictUpdate.getCourseId());
		courseDict.setSort(dictUpdate.getSort());
		return courseDictWebService.updateByDictId(courseDict);
	}
	
	
}
