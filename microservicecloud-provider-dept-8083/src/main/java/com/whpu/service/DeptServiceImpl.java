package com.whpu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whpu.dao.DeptDao;
import com.whpu.entiy.Dept;

@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptDao deptDao;
	
	 public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	 }
	  public Dept get(Long id) {
		  return deptDao.findById(id);
	  }
	  public List<Dept> list(){
		  return deptDao.findAll();
	  }
}
