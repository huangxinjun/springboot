package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
//指定web环境，随机端口
@SpringBootTest//(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class TestControllerTest {

//	@Autowired
//    private TestRestTemplate testRestTemplate;
	
	@Autowired
    private MockMvc mvc;

//    @Test
//    public void testHome(){
//        String context = testRestTemplate.getForObject("/api/test",String.class);
//        Assert.assertEquals("1",context);
//    }
//
//    @Test
//    public void testShow(){
//        String context = testRestTemplate.getForObject("/api/test1",String.class);
//        Assert.assertEquals("123",context);
//    }
    
    @Test
    public void testHome() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/test")).andExpect(MockMvcResultMatchers.status().isOk());
        mvc.perform(MockMvcRequestBuilders.get("/api/test")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("1"));
    }
}
