package com.sunshine.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sunshine.entity.TestInfo;
import com.sunshine.mapper.TestMapper;
import com.sunshine.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestMapper mapper;
	//查询全部
	@Override
	public List<TestInfo> getloadAll() {
		return mapper.getloadAll();
	}
	//根据id查询
	@Override
	public TestInfo selectTestInfo(String id) {
		return mapper.selectTestInfo(id);
	}
	//根据id修改名字
	@Override
	public int updatename(String name, String id) {
		return mapper.updatename(name,id);
	}
}
