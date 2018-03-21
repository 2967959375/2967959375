package org.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.dao.EmpDao;
import org.pojo.Emp;
import org.service.EmpService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmpServiceImpl  implements EmpService{
                      
	@Resource
	private EmpDao ed;
	
	public List<Emp> selectAll(String sql,Emp emp) {
        List<Emp> el = ed.selectAllBySql(sql,emp);
		return el;
		
	}
}
