package com.javex.pratice04;

public class Ex06 {

	public static void main(String[] args) {
		char c[] = { 't', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };

		for (int i = 0; i < c.length; i++) {
		}
		System.out.println(c);

		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				c[i] = ',';
			}
			System.out.print(c[i]);
		}

	}

}
