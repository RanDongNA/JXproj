package com.jx.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.jx.pojo.TestPojo;


@Repository("testPojoDao")
public class TestPojoDAOImpl extends AbstractDAO implements TestPojoDAO{

	@Override
	public void savePojo(TestPojo pojo) {
		persist(pojo);		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TestPojo> findAllPojos() {
		Criteria criteria = getSession().createCriteria(TestPojo.class);
        return (List<TestPojo>) criteria.list();
	}

	@Override
	public void deletePojoByName(String name) {
		Query query = getSession().createSQLQuery("delete from Employee where name = :name");
        query.setString("name", name);
        query.executeUpdate();
	}

	@Override
	public TestPojo findPojoByName(String name) {
		Criteria criteria = getSession().createCriteria(TestPojo.class);
        criteria.add(Restrictions.eq("name",name));
        return (TestPojo) criteria.uniqueResult();
	}

	@Override
	public void updatePojo(TestPojo pojo) {
		getSession().update(pojo);
	}

}
