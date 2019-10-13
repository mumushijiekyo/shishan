package com.zhss.credit.service;

import com.zhss.credit.api.CreditApi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditService implements CreditApi {

	public String add(@PathVariable("userId") Long userId, 
			@PathVariable("credit") Long credit) {
		System.out.println("对用户【userId=" + userId + "】增加积分：" + credit);    
		return "{'msg': 'success'}";
	}

}