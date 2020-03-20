package com.epam.tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Delete_A_InFirst2CharsTest {
	/*To-Do List  1.ABCD => BCD
	 * 2.AACD => CD
	 * 3.BACD =>BCD
	 * 4.BBAA => BBAA
	 * 5.AABAA => BAA
	 */
	Delete_A_InFirstTwoChars deleteA;
	 @BeforeEach
	void setUp()
	{
		deleteA=new Delete_A_InFirstTwoChars();
	}

	@Test
	void testEmptyString() {
		assertEquals("",deleteA.remove_A_FromFirstTwoChars(""));
		
	}
	@Test
	void testStringWithNoChars() {
		assertEquals(" ",deleteA.remove_A_FromFirstTwoChars(" "));
	}
	@Test
	void testStringWithOnlyA() {
		assertEquals("",deleteA.remove_A_FromFirstTwoChars("A"));
	}
	@Test
	void testSingle_N0_A() {
		assertEquals("B",deleteA.remove_A_FromFirstTwoChars("B"));
	}
	@Test
	void testDouble_N0_A() {
		assertEquals("BC",deleteA.remove_A_FromFirstTwoChars("BC"));
	}
	
	@Test
	void testStringWithOnlyAA() {
		assertEquals("",deleteA.remove_A_FromFirstTwoChars("AA"));
	}
	@Test
	void test_No_A_AtFirstTwoChars() {
		assertEquals("BBAA",deleteA.remove_A_FromFirstTwoChars("BBAA"));
	}
	@Test
	void testStringWith_A_AtFirstIndexOnly() {
		assertEquals("BCD",deleteA.remove_A_FromFirstTwoChars("ABCD"));
	}
	@Test
	void testStringWith_A_AtSecondIndexOnly() {
		assertEquals("BCD",deleteA.remove_A_FromFirstTwoChars("BACD"));
	}
	@Test
	void testStringWith_A_AtFirstTwoIndexes() {
		assertEquals("BAA",deleteA.remove_A_FromFirstTwoChars("AABAA"));
	}


}
