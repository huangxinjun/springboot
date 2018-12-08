package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
//指定web环境，随机端口
@SpringBootTest//(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
public class TestControllerTest {

	@Autowired
	@InjectMocks
    private TestController testController;
	
	@Mock  
    private UserService userService;  
	
//	@Autowired
//    private MockMvc mvc;

//    @Test
//    public void queryEnum1(){
//        String context = testRestTemplate.getForObject("/api/test",String.class);
//        Assert.assertEquals("1",context);
//    }
//
//    @Test
//    public void queryEnum2(){
//        String context = testRestTemplate.getForObject("/api/test1",String.class);
//        Assert.assertEquals("123",context);
//    }
	
	@Test
    public void queryEnum1() {
    	try {
			testController.queryEnum1();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	@Test
    public void queryEnum3() {
    	try {
			testController.queryEnum3();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	@Test
    public void queryEnum4() {
    	try {
			testController.queryEnum4();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	@Test
    public void queryEnum5() {
    	try {
			testController.queryEnum5();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
    @Test
    public void queryEnum2() {
    	try {
			System.out.println(testController.queryEnum2());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 //   	System.out.println(testController.queryEnum2());
//    	 MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/api/test1"))
//                 .andExpect(MockMvcResultMatchers.status().isOk())
//                 .andDo(MockMvcResultHandlers.print())
//                 .andReturn();
//         String content = mvcResult.getResponse().getContentAsString();
//         System.out.println("content" + content);
        //mvc.perform(MockMvcRequestBuilders.get("/api/test1")).andExpect(MockMvcResultMatchers.status().isOk());
        //mvc.perform(MockMvcRequestBuilders.get("/api/test1")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("1"));
    }
    
//    @Before  
//    public void setUp() throws Exception {  
//        MockitoAnnotations.initMocks(this);  
//        this.mvc = MockMvcBuilders.standaloneSetup(testController).build();  
//    }    
}
