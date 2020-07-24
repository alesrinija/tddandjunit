package com.epam.tdd_junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveFirstTwoAsTest {
RemoveFirst2As firstA;
	
	@BeforeEach
	void setUp()
	{
		 firstA = new RemoveFirst2As();
	}
	
	@Test
	void test_First_A() 
	{
		assertEquals("BCD",firstA.removeA("ABCD"));
	}
	
	@Test
	void test_Second_A() 
	{
		assertEquals("BCD",firstA.removeA("BACD"));
	}
	
	@Test
	void test_First_A_Second_A() 
	{
		assertEquals("CD",firstA.removeA("AACD"));
	}
	
	@Test
	void test_Zero_A() 
	{
		assertEquals("BBAA",firstA.removeA("BBAA"));
	}
	
	@Test
	void test_OnlyFirst2As() 
	{
		assertEquals("BAA",firstA.removeA("AABAA"));
	}
	
	

}
