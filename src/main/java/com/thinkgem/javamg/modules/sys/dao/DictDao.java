/**
 * 
 */
package com.thinkgem.javamg.modules.sys.dao;

import java.util.List;

import com.thinkgem.javamg.common.persistence.CrudDao;
import com.thinkgem.javamg.common.persistence.annotation.MyBatisDao;
import com.thinkgem.javamg.modules.sys.entity.Dict;

/**
 * 字典DAO接口
 * 
 * @version 2014-05-16
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	public List<String> findTypeList(Dict dict);
	
}
