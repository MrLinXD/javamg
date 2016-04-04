/**
 * 
 */
package com.thinkgem.javamg.test.dao;

import com.thinkgem.javamg.common.persistence.TreeDao;
import com.thinkgem.javamg.common.persistence.annotation.MyBatisDao;
import com.thinkgem.javamg.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 * 
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}