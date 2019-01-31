package com.talelife.edu.dict.web.service;

import com.talelife.edu.dict.dao.entity.Dict;
import com.talelife.edu.dict.web.vo.DictAdd;
import com.talelife.edu.dict.web.vo.DictUpdate;
import com.talelife.framework.service.CrudService;

public interface DictWebService extends CrudService<Dict>{

	boolean save(DictAdd dictAdd);
	boolean updateById(DictUpdate dictUpdate);
}

