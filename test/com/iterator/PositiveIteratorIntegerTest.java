package com.iterator;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

public class PositiveIteratorIntegerTest {

	@Test
	public void testIter () {
		Iterator<Integer> intIter = Arrays.asList(new Integer[] {null, -1, 2, null, 15, -4, 50,
		null}).iterator();
		Iterator<Integer> iter = new PositiveIteratorInteger(intIter);
		//multiple hasNext() calls succeed
		for (int i = 0; i < 100; i++) {
		assert iter.hasNext();
		}
		//values are correct
		assert iter.hasNext();
		assert iter.next() == 2;
		//no hasNext() call...
		assert iter.next() == 15;
		assert iter.hasNext();
		assert iter.next() == 50;
		//assert iter.hasNext() == false;
	}

}
