package com.whpu.service;

import java.util.List;

import com.whpu.entiy.Dept;

public interface DeptService {
	 public boolean add(Dept dept);
	  public Dept get(Long id);
	  public List<Dept> list();
}
