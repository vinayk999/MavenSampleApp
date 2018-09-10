package com.app.test;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Test {

	@RequestMapping("/show")
	public  String m1(String[] args) {
		Logger log=Logger.getLogger(Test.class);
		int i=1;
		log.debug("debug");
		log.error("error");

		return "Home";
	}
}
