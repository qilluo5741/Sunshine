package com.sunshine.service;

import java.util.List;

import com.sunshine.entity.TestInfo;
public interface TestService {
	//查询全部
	public List<TestInfo> getloadAll();
	//根据id查询
	public TestInfo selectTestInfo(String id);
	//根据id修改名字
	public int updatename(String name,String id);
}
