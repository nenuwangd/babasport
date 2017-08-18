package com.wangdi.core.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.core.dao.TestTbDao;
import com.itheima.core.pojo.TestTb;

@Service("tbServiceImpl")
@Transactional
public class TbServiceImpl implements TbInterface {
	@Autowired
	private TestTbDao tbDao;

	@Override
	public void insert(TestTb tb) {
		
		tbDao.insertTestTb(tb);
	}

	@Override
	@Test
	public void update(TestTb tb) {
	
		tbDao.updateTestTb(tb);
		
	}

}
