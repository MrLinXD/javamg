/**
 * 
 */
package com.thinkgem.javamg.modules.gen.dao;

import com.thinkgem.javamg.common.persistence.CrudDao;
import com.thinkgem.javamg.common.persistence.annotation.MyBatisDao;
import com.thinkgem.javamg.modules.gen.entity.GenTable;

/**
 * 业务表DAO接口
 * 
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTableDao extends CrudDao<GenTable> {
	
}
