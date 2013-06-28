package com.onejli;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleTest {
	@Test
	public void testReturnNone() {
		Count c = new Count();
		String[] foo = null;
		assertEquals("", c.doStuff(foo));
	}

	@Test
	public void testReturnOne() {
		Count c = new Count();
		String[] foo = {"foo"};
		assertEquals("foo\n", c.doStuff(foo));
	}

	@Test
	public void testReturnThree() {
		Count c = new Count();
		String[] foo = {"foo", "bar", "baz"};
		assertEquals("foo\nbar\nbaz\n", c.doStuff(foo));
	}

	public static void main(String[] args) {
	}
}
