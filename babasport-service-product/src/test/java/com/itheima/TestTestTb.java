package com.itheima;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.core.pojo.TestTb;
import com.wangdi.core.service.TbInterface;

/**
 * 测试Spring整合Mybatis
 * 
 * @author lx
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestTestTb {

	
/*	@Autowired
//	private TestTbDao testTbDao;
	private TestTbService testTbService;*/
	@Autowired
	@Qualifier("tbServiceImpl")
	private TbInterface tbService;
	@Test
	public void testAdd() throws Exception {
		TestTb testTb = new TestTb();
		testTb.setName("阿四");
		testTb.setBirthday(new Date());
		tbService.insert(testTb);
	}
	
	@Test
	public void testUpdate() throws Exception {
		TestTb testTb = new TestTb();
		testTb.setId(1);
		testTb.setName("王五");
		testTb.setBirthday(new Date());
		tbService.update(testTb);
	}
}
