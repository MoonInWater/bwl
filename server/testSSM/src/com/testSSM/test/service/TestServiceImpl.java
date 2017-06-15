package com.testSSM.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.testSSM.test.dao.TestMapper;
import com.testSSM.test.model.User;

@Service("testService")
public class TestServiceImpl implements TestService{

	@Resource
	private TestMapper testMapper;

	@Override
	public User queryTest(String userId) {
		return testMapper.queryTest(userId);
	}

}
