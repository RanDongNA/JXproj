package com.jx.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jx.dao.TestPojoDAO;
import com.jx.pojo.TestPojo;
 
 
@Service("pojoService")
@Transactional
public class PojoServiceImpl implements PojoService{
 
    @Autowired
    private TestPojoDAO testPojoDAO;

	@Override
	public void savePojo(TestPojo pojo) {
		testPojoDAO.savePojo(pojo);
	}

	@Override
	public List<TestPojo> findAllPojos() {
		return testPojoDAO.findAllPojos();
	}

	@Override
	public void deletePojoByName(String name) {
		testPojoDAO.deletePojoByName(name);		
	}

	@Override
	public TestPojo findPojoByName(String name) {
		return testPojoDAO.findPojoByName(name);
	}

	@Override
	public void updatePojo(TestPojo pojo) {
		testPojoDAO.updatePojo(pojo);		
	}

}