package com.hyc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleAutoTest {


	Triangle T1 = new Triangle(2, 3, 4);
	Triangle T2 = new Triangle(3, 4,5);
	Triangle T3 = new Triangle(2, 13, 14);
	Triangle T4 = new Triangle(6, 8, 14);
	Triangle T5 = new Triangle(21, 31, 40);
	Triangle T6 = new Triangle(12, 13, 34);
	Triangle T7 = new Triangle(21, 30, 40);

	@Test
	public void testIsTriangle1() {
		assertEquals(true, T1.isTriangle(T1));
	}
	@Test
	public void testIsTriangle2() {
		assertEquals(true, T2.isTriangle(T2));
	}@Test
	public void testIsTriangle3() {
		assertEquals(true, T3.isTriangle(T3));
	}@Test
	public void testIsTriangle4() {
		assertEquals(true, T4.isTriangle(T4));
	}@Test
	public void testIsTriangl5() {
		assertEquals(true, T5.isTriangle(T5));
	}@Test
	public void testIsTriangle6() {
		assertEquals(true, T6.isTriangle(T6));
	}@Test
	public void testIsTriangle7() {
		assertEquals(true, T7.isTriangle(T7));
	}

}
