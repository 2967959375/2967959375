package org.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.dao.EmpDao;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pojo.Emp;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl extends BaseDaoImpl<Emp>implements EmpDao{
	@Resource
	private SessionFactory sf; 
	
	@Override
	public List<Emp> select() {
		Session session = sf.getCurrentSession();
		SQLQuery query = session.createSQLQuery("select * from emp").addEntity(Emp.class);
		List el = query.list();
		System.out.println(el);
		return el;
		
	}

}

