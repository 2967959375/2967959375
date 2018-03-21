package org.web;

import java.util.List;

import javax.annotation.Resource;

import org.pojo.Emp;
import org.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpWeb {
	
	@Resource
	private EmpService es;
	
	@RequestMapping("/list")
	public  String fn(){
		String sql ="select * from emp";
		List<Emp> el = es.selectAll(sql, new Emp());
		System.out.println(el);
		return "el";
		
	}
	

}
