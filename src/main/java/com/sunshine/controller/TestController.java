package com.sunshine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunshine.entity.TestInfo;
import com.sunshine.entityDto.Result;
import com.sunshine.service.TestService;

@Controller
@RequestMapping("test")
public class TestController {
	@Autowired
	private TestService service;
	/**
	 * test/test.do
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value="test",method=RequestMethod.POST)
	public Result test() throws Exception{
		List<TestInfo> test=service.getloadAll();
		return new Result(200,"³É¹¦",test);
	}
}
