package com.wangdi.core.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.core.pojo.TestTb;
import com.itheima.core.service.TestTbService;

@Controller
public class TestController {
	
	@Autowired
	@Qualifier("tbService")
	private TestTbService tbService;
	@RequestMapping("/index")
	public String index() {
		TestTb testTb = new TestTb();
		testTb.setName("周扒皮");
		testTb.setBirthday(new Date());
		tbService.insertTestTb(testTb);
		return "index";
	}

}
