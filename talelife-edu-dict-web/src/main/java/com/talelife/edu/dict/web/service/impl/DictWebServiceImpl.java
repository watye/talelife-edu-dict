package com.talelife.edu.dict.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talelife.framework.mapper.CrudMapper;
import com.talelife.framework.service.CrudServiceImpl;
import com.talelife.edu.dict.dao.DictMapper;
import com.talelife.edu.dict.dao.entity.Dict;
import com.talelife.edu.dict.web.service.DictWebService;

@Service
public class DictWebServiceImpl extends CrudServiceImpl<Dict> implements DictWebService {
	@Autowired
	private DictMapper mapper;

	@Override
	public CrudMapper<Dict> getDao() {
		return this.mapper;
	}
}
