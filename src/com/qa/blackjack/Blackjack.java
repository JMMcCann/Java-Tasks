package com.qa.blackjack;

public class Blackjack {
	public static void main(String[] args) {
		blackjack(1, 20);

	}

	public static void blackjack(int A, int B) {
		if (A > B) {
			if (A <= 21) {
				System.out.println(A);
			} else if (A > 21) {
				if (B <= 21)
					System.out.println(B);
			} else {
				System.out.println(1);
			}
		} else {
			if (B > A) {
				if (B <= 21) {
					System.out.println(B);
				} else if (B > 21) {
					if (A <= 21)
						System.out.println(A);
				} else {
					System.out.println(0);
				}
			}
		}
	}
}
