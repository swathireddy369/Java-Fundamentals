package com.java.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes sObj=new Shapes();
	

	@Test
	void testComputeSquareArea() {
		assertEquals(576,sObj.computeSquareArea(24));
		
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5,sObj.computecircleArea(5),"Area of circle is wrong");
		
	}
	@Test
	void testComputeCircleArea_Supplier() {
		assertEquals(79.5,sObj.computecircleArea(5),()-> "Area of circle is wrong");
		
	}

}
