package com.in28minutes.SpringBootUnitTestingandMockingwithMockitoandJUnit;

import com.in28minutes.SpringBootUnitTestingandMockingwithMockitoandJUnit.sample.MyMath;
import org.junit.*;

public class MyMathTest {
	MyMath myMath = new MyMath();

	@Before
	public void before() {
		System.out.println("Before");
	}

	@After
	public void after() {
		System.out.println("After");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

	// MyMath.sum
	// 1,2,3 => 6
	@Test
	public void sum_with3numbers() {
		System.out.println("Test1");
		Assert.assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
	}

	@Test
	public void sum_with1number() {
		System.out.println("Test2");
		Assert.assertEquals(3, myMath.sum(new int[] { 3 }));
	}

	@Test
	public void sum_withNoNumber(){
		System.out.println("tEST 3");
		Assert.assertEquals(0, myMath.sum(new int[]{}));
	}
}
