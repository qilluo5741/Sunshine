package com.sunshine.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sunshine.entity.TestInfo;
public interface TestMapper {
	//��ѯȫ��
	public List<TestInfo> getloadAll();
	//����id��ѯ
	public TestInfo selectTestInfo(@Param("id")String id);
	//����id�޸�����
	public int updatename(@Param("name")String name,@Param("id")String id);
}
