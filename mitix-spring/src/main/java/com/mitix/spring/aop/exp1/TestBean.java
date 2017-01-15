/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.aop.exp1;

/**
 * @version 1.0.0
 * @author oldflame-Jm first example this is a pojo
 */
public class TestBean {
	private String testStr = "hello world!!";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
	public void print(){
	  System.out.println("this is testbean say1 "+this.testStr);
	}
	
	   public void print2(){
	      System.out.println("this is testbean say2 "+this.testStr);
	    }
}
