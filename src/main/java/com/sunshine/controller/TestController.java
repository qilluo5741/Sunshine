package com.sunshine.controller;

import java.io.ByteArrayInputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunshine.entityDto.Result;
import com.sunshine.service.FileService;
import com.sunshine.service.TestService;
import com.sunshine.util.Base64;

@Controller
@RequestMapping("test")
public class TestController {
	private Logger log=LoggerFactory.getLogger(this.getClass());
	@Autowired
	private TestService service;
	@Autowired
	private FileService fileService;
	/**
	 * test/test.do?id=96899012715610112&name=Administrator
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value="test",method=RequestMethod.POST)
	public Result test(String id,String name,String headportrait) throws Exception{
		//查询全部
		//List<TestInfo> test=service.getloadAll();
		//根据id查询
		//TestInfo test=service.selectTestInfo(id);
		//根据id修改名字
		try {
			if(service.updatename(name,id)>=0){
				return new Result(200,"修改成功！",true);
			}
			byte[] by = Base64.decode(headportrait);
			ByteArrayInputStream bais = new ByteArrayInputStream(by);
			String headimg = this.fileService.uploadImage(bais);
			System.out.println(headimg+"图片链接");
		} catch (Exception e) {
			log.error("修改失败异常！");
			System.out.println("修改失败异常！");
		}
		return new Result(2001,"修改失败！",false);
	}
}
