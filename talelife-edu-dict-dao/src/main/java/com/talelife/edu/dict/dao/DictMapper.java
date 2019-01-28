package com.talelife.edu.dict.dao;

import com.talelife.framework.mapper.CrudMapper;
import org.apache.ibatis.annotations.Mapper;
import com.talelife.edu.dict.dao.entity.Dict;

/**
 * 单词
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-01-28 17:10:13
 */
@Mapper
public interface DictMapper extends CrudMapper<Dict> {
	
}
