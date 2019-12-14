package com.whpu.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.whpu.entiy.Dept;

@Component
public interface DeptDao {
	 public boolean addDept(Dept dept);
	  public Dept    findById(Long id);
	  public List<Dept> findAll();
}
