package com.hengyangshiyuan.hrsystem.service;

import java.util.List;

import com.hengyangshiyuan.hrsystem.entities.Dept;

public interface DeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
