package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;

@RestController
public class DeptController
{
    @Autowired
    private DeptService service;

    @GetMapping(value="/dept/getadd/{dname}")
    public boolean getAddPathVariable(@PathVariable("dname") String dname)
    {
        return service.getadd(dname);
    }

    @GetMapping(value="/dept/getadd")
    public boolean getAddRequestParam(@RequestParam("dname") String dname)
    {
        return service.getadd(dname);
    }

    @PostMapping(value="/dept/add")
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }

    @GetMapping(value="/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

    @GetMapping(value="/dept/list")
    public List<Dept> list()
    {
        return service.list();
    }


}


