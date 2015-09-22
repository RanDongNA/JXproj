package com.jx.services;

import java.util.List;

import com.jx.pojo.TestPojo;

public interface PojoService {
 
    void savePojo(TestPojo pojo);
 
    List<TestPojo> findAllPojos();
 
    void deletePojoByName(String name);
 
    TestPojo findPojoByName(String name);
 
    void updatePojo(TestPojo pojo);
}