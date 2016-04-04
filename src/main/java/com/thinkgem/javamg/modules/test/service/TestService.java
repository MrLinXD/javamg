/**
 * 
 */
package com.thinkgem.javamg.modules.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.javamg.common.service.CrudService;
import com.thinkgem.javamg.modules.test.entity.Test;
import com.thinkgem.javamg.modules.test.dao.TestDao;

/**
 * 测试Service
 * 
 * @version 2013-10-17
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

}
