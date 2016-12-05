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
		//��ѯȫ��
		//List<TestInfo> test=service.getloadAll();
		//����id��ѯ
		//TestInfo test=service.selectTestInfo(id);
		//����id�޸�����
		try {
			if(service.updatename(name,id)>=0){
				return new Result(200,"�޸ĳɹ���",true);
			}
			byte[] by = Base64.decode(headportrait);
			ByteArrayInputStream bais = new ByteArrayInputStream(by);
			String headimg = this.fileService.uploadImage(bais);
			System.out.println(headimg+"ͼƬ����");
		} catch (Exception e) {
			log.error("�޸�ʧ���쳣��");
			System.out.println("�޸�ʧ���쳣��");
		}
		return new Result(2001,"�޸�ʧ�ܣ�",false);
	}
}
