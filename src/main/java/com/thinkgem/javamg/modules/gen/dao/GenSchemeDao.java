/**
 * 
 */
package com.thinkgem.javamg.modules.gen.dao;

import com.thinkgem.javamg.common.persistence.CrudDao;
import com.thinkgem.javamg.common.persistence.annotation.MyBatisDao;
import com.thinkgem.javamg.modules.gen.entity.GenScheme;

/**
 * 生成方案DAO接口
 * 
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenSchemeDao extends CrudDao<GenScheme> {
	
}
