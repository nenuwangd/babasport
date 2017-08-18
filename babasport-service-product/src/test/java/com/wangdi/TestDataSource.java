package com.wangdi;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:application-context.xml"})
public class TestDataSource {
	
	@Autowired
	private DataSource ds;
	@Test
	public void testDataSource() {
		System.out.println(ds);
		/**
		 * {
				CreateTime:"2017-08-18 17:18:19",
				ActiveCount:0,
				PoolingCount:0,
				CreateCount:0,
				DestroyCount:0,
				CloseCount:0,
				ConnectCount:0,
				Connections:[
				]
			}
		 */
	}
	
}
