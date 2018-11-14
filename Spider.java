package com.how2j.interface2;

public class Spider extends Animal{
	
	/**
	 	1. Spider继承Animal类。
		2. 定义默认构造器，它调用父类构造器来指明所有蜘蛛都是8条腿。
		3. 实现eat方法
	 */
	  String name;
	    //定义默认构造器，它调用父类构造器来指明所有蜘蛛都是8条腿。
	    public Spider() {
	        super(8);
	        name = "蜘蛛";
	    }
	     
	    public void eat() {
	        System.out.println("蜘蛛吃昆虫....");
	    }
	    
	    public String getName(){
	    	return name;
	    }
	}
