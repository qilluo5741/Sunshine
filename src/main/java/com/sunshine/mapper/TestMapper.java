package com.sunshine.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sunshine.entity.TestInfo;
public interface TestMapper {
	public List<TestInfo> getloadAll();
	public TestInfo selectTestInfo(@Param("id")String id);
}
