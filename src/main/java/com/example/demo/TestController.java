package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value="/api/test",method = RequestMethod.GET)
    public String queryEnum1() throws Exception {
    	System.out.println(123);
    	return "123";
    }
	
	@RequestMapping(value="/api/test1",method = RequestMethod.GET)
    public String queryEnum2() throws Exception {
    	System.out.println(123);
    	return "123";
    }
	
	@RequestMapping(value="/api/test2",method = RequestMethod.GET)
    public void queryEnum3() throws Exception {
    	System.out.println(123);
    }
	
	@RequestMapping(value="/api/test3",method = RequestMethod.GET)
    public void queryEnum4() throws Exception {
    	System.out.println(123);
    }
	
	@RequestMapping(value="/api/test4",method = RequestMethod.GET)
    public void queryEnum5() throws Exception {
    	System.out.println(123);
    }
	
	@RequestMapping(value="/api/test5",method = RequestMethod.GET)
    public void queryEnum6() throws Exception {
    	int a=5;
    	int b=0;
    	int c=a/b;
    }

}
