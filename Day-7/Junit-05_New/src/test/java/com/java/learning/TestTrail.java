package com.java.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrail {

	@Test
	void test() {
		assertEquals(5,5);
	}
    @Test
	void testComputeSquareArea() {
    	Shapes sObj=new Shapes();
//		assertEquals(576,sObj.computeSquareArea(24));
    	assertNotEquals(506,sObj.computeSquareArea(24));
	}
    @Test
    void testComputeSquareArea_withMessage() {
    	Shapes sObj=new Shapes();
//		assertEquals(576,sObj.computeSquareArea(24));
    	assertNotEquals(506,sObj.computeSquareArea(24),"show Message if fail");
	}
    @Test
    void test1() {
    	assertTrue(true);
    }
}    
