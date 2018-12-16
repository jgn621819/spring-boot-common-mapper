package com.baizhi.controller;

import com.baizhi.mapper.TalkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/talk")
public class TalkController {
    @Autowired
    TalkMapper talkMapper;
    @RequestMapping("test")
    public void test(){
        talkMapper.selectAll();
    }
}
