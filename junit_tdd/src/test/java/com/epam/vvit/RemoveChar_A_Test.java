package com.epam.vvit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveChar_A_Test {
	
	/*TODO list for my feature
	 * 1. In First index: ABCD=>BCD
	 * 2. In First two Indices: AACD=>CD
	 * 3. In 2nd index: BACD=>BCD
	 * 4. In last two indices:BBAA=>BBAA
	 * 5. In all indices: AABAA=>BAA
	 * 6. Single Char: A =>""
	 * 7. Empty string:""=>""
	 * 8. Two A-Chars: AA=>""
	 */
	RemoveChars_A remove_a = new RemoveChars_A();
	@Test
	void test_FirstIndex_SingleA() {
		String actual = remove_a.removeA("ABCD");
		assertEquals("BCD",actual);
	}
	@Test
	void test_FirstTwoIndices_A() {
		String actual = remove_a.removeA("AACD");
		assertEquals("CD",actual);
	}
	@Test
	void test_SecondIndex_SingleA() {
		String actual = remove_a.removeA("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	void test_LastTwoIndices_A() {
		String actual = remove_a.removeA("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	void test_AllIndices_A() {
		String actual = remove_a.removeA("AABAA");
		assertEquals("BAA",actual);
	}
	@Test
	void test_Singlechar_A() {
		String actual = remove_a.removeA("A");
		assertEquals("",actual);
	}
	@Test
	void test_Twochar_A() {
		String actual = remove_a.removeA("AA");
		assertEquals("",actual);
	}
	@Test
	void test_EmptyChar() {
		String actual = remove_a.removeA("");
		assertEquals("",actual);
	}
	

}
