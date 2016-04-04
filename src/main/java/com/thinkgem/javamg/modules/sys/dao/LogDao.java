/**
 * 
 */
package com.thinkgem.javamg.modules.sys.dao;

import com.thinkgem.javamg.common.persistence.CrudDao;
import com.thinkgem.javamg.common.persistence.annotation.MyBatisDao;
import com.thinkgem.javamg.modules.sys.entity.Log;

/**
 * 日志DAO接口
 * 
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
