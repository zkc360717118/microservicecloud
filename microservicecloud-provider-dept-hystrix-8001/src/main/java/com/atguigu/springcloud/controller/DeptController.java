package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController{
    @Autowired
    private DiscoveryClient client;

    @Autowired
    private DeptService service;


    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    //@HystrixCommand 一旦调用服务方法失败，并抛出了错误信息后，会自动调用fallbackMethod类标注好的方法processHystrix_Get（）
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = service.get(id);
        if (null == dept) {
            throw new RuntimeException("id:" + id + "没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id).setDname("该id" + id + "无信息").setDb_source("no this database in mysql");
    }

}
