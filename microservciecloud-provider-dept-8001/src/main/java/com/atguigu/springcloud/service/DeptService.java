package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entitis.Dept;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
