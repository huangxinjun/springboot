package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//指定web环境，随机端口
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestControllerTest {

	@Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testHome(){
        String context = testRestTemplate.getForObject("/api/test",String.class);
        Assert.assertEquals("123",context);
    }

    @Test
    public void testShow(){
        String context = testRestTemplate.getForObject("/api/test1",String.class);
        Assert.assertEquals("123",context);
    }
}
