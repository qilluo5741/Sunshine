package com.sunshine.service;

import java.util.List;

import com.sunshine.entity.TestInfo;
public interface TestService {
	//��ѯȫ��
	public List<TestInfo> getloadAll();
	//����id��ѯ
	public TestInfo selectTestInfo(String id);
	//����id�޸�����
	public int updatename(String name,String id);
}
