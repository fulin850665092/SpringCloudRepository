package com.hengyangshiyuan.hrsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hengyangshiyuan.hrsystem.bean.Dept;
import com.hengyangshiyuan.hrsystem.dao.DeptDao;
import com.hengyangshiyuan.hrsystem.service.DeptService;

@Service
public class DeptServiceImp implements DeptService{
	@Autowired
	private DeptDao deptDao;

	public boolean add(Dept dept) {	
		return deptDao.addDept(dept);
	}

	public Dept get(Long id) {		
		return deptDao.findById(id);
	}

	public List<Dept> list() {	
		return deptDao.findAll();
	}

	
	
}
