package com.onejli;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdvancedTest {
	@Test
	public void testReturnFour() {
		Count c = new Count();
		String[] foo = {"foo", "bar", "baz", "foobar"};
		assertEquals("foo\nbar\nbaz\nfoobar\n", c.doStuff(foo));
	}

	public static void main(String[] args) {
	}
}
