package com.app.test;

import org.apache.log4j.Logger;

public class Test1 {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger(Test1.class);
		
		log.warn("warn test1");
		log.error("error1");
		
		
	}
}
