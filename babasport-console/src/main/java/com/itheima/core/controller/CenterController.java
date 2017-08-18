package com.itheima.core.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.core.pojo.TestTb;
import com.itheima.core.service.TestTbService;

/**
 * 后台管理中心
 * @author lx
 *
 */
@Controller
public class CenterController {

	
	@Autowired
	private TestTbService testTbService;
	//入口
	@RequestMapping(value = "/test/index.do")
	public String index(){
		TestTb testTb = new TestTb();
		testTb.setName("阿四");
		testTb.setBirthday(new Date());
		testTbService.insertTestTb(testTb);
		
		return "index";
	}
}
