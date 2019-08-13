package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {
    @Autowired
    private RestTemplate template;
    private static final String REST_URL_PREFIX ="http://localhost:8001";

    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept) {

        return template.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {

        return template.getForObject(REST_URL_PREFIX+ "/dept/get/"+id, Dept.class);
    }

    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list() {

        return template.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }
}
