/*
 * This is an example program which takes String arguments and prints them
 */
package com.CodeRejoice.JLS8_1_2;

/**
 * The Class ExampleProgram.
 */
public class ExampleProgram {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments can be passed while running the code as below
	 *            a) Compile the code using javac ExampleProgram.java
	 *            b) Run the program using java <arg 1> <arg 2> <arg 3>.... <arg N>
	 */
	public static void main(String[] args) {
		int len = args.length;
		for (int i = 0; i < len; i++) {
			System.out.println(args[i]);

		}

	}
}