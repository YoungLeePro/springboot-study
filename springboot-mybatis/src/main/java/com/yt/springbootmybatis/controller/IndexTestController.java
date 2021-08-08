package com.yt.springbootmybatis.controller;

import com.yt.springbootmybatis.mapper.IndexTestMapper;
import com.yt.springbootmybatis.model.IndexTest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @USER: Young
 * @DATETIME: 2021/2/27
 * @DESCRIPTION:
 **/
@RestController
@RequestMapping("index")
public class IndexTestController {

    @Resource
    private IndexTestMapper indexTestMapper;

    @GetMapping("insert")
    public void insert(){
        for (int i = 1; i < 500000; i++) {
            IndexTest indexTest = new IndexTest();
            indexTest.setId(Long.valueOf(Integer.valueOf(i)));
            indexTest.setDescr("描述" + i);
            indexTest.setName("名" + i + "称");
            indexTest.setNum(Long.valueOf(Integer.valueOf(i + 20)));
            indexTestMapper.insert(indexTest);
            System.out.println("插入了第" + i + "条数据");
        }
    }

    @GetMapping("http")
    public void http(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setStatus(302);
        response.sendRedirect("http://www.baidu.com");
    }


    @PostMapping("postRequest")
    public String postRequest(String name, String age){
        return name + age;
    }

    @RequestMapping(name = "headRequest", method = RequestMethod.HEAD)
    public String headRequest(){
        return "head";
    }

    @PutMapping(name = "putRequest")
    public String putRequest(){
        return "put";
    }

    @DeleteMapping(name = "deleteRequest")
    public String deleteRequest(){
        return "delete";
    }

    @RequestMapping(name = "optionsRequest", method = RequestMethod.OPTIONS)
    public String optionsRequest(){
        return "delete";
    }
}
