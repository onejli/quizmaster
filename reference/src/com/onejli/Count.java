package com.onejli;

import java.lang.String;
import java.lang.System;

public class Count {
	public String doStuff(String[] args) {
		String returnMe = "";

		if (args != null) {
			for (int i=0; i<args.length; i++) {
				returnMe+=args[i]+"\n";
			}
		}

		return returnMe;
	}

	public static void main(String[] args) {
		Count c = new Count();
		System.out.println(c.doStuff(args));
	}
}
