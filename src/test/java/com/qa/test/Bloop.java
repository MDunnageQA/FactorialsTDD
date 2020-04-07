package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.main.Factorials;

public class Bloop 
{
	@Test
	public void testIfFive()
	{
		assertEquals(5, Factorials.getFactorialNumber(120));
	}
	
	@Test
	public void testIfNone()
	{
		assertEquals("None", 0, Factorials.getFactorialNumber(150));
	}
	
	@Test
	public void challengeTestOne()
	{
		assertEquals(10, Factorials.getFactorialNumber(3628800));
	}
	
	@Test
	public void challengeTestTwo()
	{
		assertEquals(12, Factorials.getFactorialNumber(479001600));
	}
	
	@Test
	public void challengeTestThree()
	{
		assertEquals(3, Factorials.getFactorialNumber(6));
	}
	
	@Test
	public void challengetestFour()
	{
		assertEquals("None", 0, Factorials.getFactorialNumber(18));
	}

}
