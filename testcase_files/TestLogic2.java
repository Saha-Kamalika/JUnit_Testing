package com.junit.testcase;
import junit_Testing.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.After;

public class TestLogic2 {
	@BeforeClass
	public static void checkBeforeClass() throws Exception{
		System.out.println("Before Class invoked");
	}
	
	@Before
	public void checkBefore() throws Exception{
		System.out.println("Before invoked");
	}
	
	@AfterClass
	public static void checkAfterClass() throws Exception{
		System.out.println("After Class invoked");
	}
	
	@After
	public void checkAfter() throws Exception{
		System.out.println("After invoked");
	}
	
	@Test
	public void checkMax() {
		System.out.println("Inside Max Method");
		assertEquals(10,CheckAll.Max(new int[] {1,5,2,9,10}));
	}
	
	@Test
	public void checkSquare() {
		System.out.println("Inside square method");
		assertEquals(16,CheckAll.square(4));
	}
	
	@Test
	public void checkPrime() {
		System.out.println("Inside isPrime method");
		assertEquals(false,CheckAll.isPrime(4));
	}
	
	@Test
	public void checkReverse() {
		System.out.println("Inside reverse method");
		assertEquals(" akilamak si eman yM",CheckAll.reverse("My name is kamalika "));
	}
	
}
