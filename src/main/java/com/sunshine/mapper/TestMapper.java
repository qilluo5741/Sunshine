package com.sunshine.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sunshine.entity.TestInfo;
public interface TestMapper {
	//查询全部
	public List<TestInfo> getloadAll();
	//根据id查询
	public TestInfo selectTestInfo(@Param("id")String id);
	//根据id修改名字
	public int updatename(@Param("name")String name,@Param("id")String id);
}
