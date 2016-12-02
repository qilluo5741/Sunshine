package com.sunshine.controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunshine.entityDto.Result;
import com.sunshine.service.FileService;
/**
 * ���ߣ�weimeilayer@163.com
 * ʱ�䣺2016-10-14
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/file")
public class FileController {
	private Logger log=LoggerFactory.getLogger(this.getClass());
	@Autowired
	private FileService fileService;
	/**
	 * ͼƬ�ϴ�
	 * @return
	 * file/getfile.do
	 */
	@ResponseBody
	@RequestMapping(value="getfile",method=RequestMethod.POST)
	public Result getfile(){
		try {
			File fileisE = new File("D:\\Android\\4.png");
			FileInputStream inputFile = new FileInputStream(fileisE);
			byte[] buffer = new byte[(int)fileisE.length()];
			inputFile.read(buffer);
			inputFile.close();
			String file = new Base64().encodeToString(buffer);
			System.out.println(file);
			byte[] oc = new Base64().decode(file);
			System.out.println(oc);
			ByteArrayInputStream bais = new ByteArrayInputStream(oc);
			System.out.println(bais);
			String headimg = this.fileService.uploadImage(bais);
			System.out.println(headimg);
			return new Result(200,"�ɹ�",headimg);
		} catch (IOException e) {
			log.error("�����쳣��");
			System.out.println("�����쳣��");
		}
		return new Result(2001,"�����쳣��");
	}
}
