package com.crm.vTiger.testCases;

import org.testng.annotations.Test;

public class RunTimeParameterTest {
	@Test
	public void loginParameter() {
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
	}

}
