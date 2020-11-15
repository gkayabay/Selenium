package com.syntax.hw;

import com.syntax.utils.BaseClass;

public class TestClass extends BaseClass {

	public static void main(String[] args) {
		
		setUp();   //open the browser and open the url
		
		String title= driver.getTitle();
		
		System.out.println(title);
		
		tearDown();
		
	}

}
