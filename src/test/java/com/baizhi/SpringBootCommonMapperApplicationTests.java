package com.baizhi;

import com.baizhi.entity.Talk;
import com.baizhi.mapper.TalkMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCommonMapperApplicationTests {
    @Autowired
    TalkMapper talkMapper;
    @Test
    public void test1() {
        List<Talk> talks = talkMapper.selectAll();
        for (Talk talk : talks) {
            System.out.println(talk);
        }
    }

}

