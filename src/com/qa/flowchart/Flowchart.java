package com.qa.flowchart;

public class Flowchart {

	public static int A;

	public static void main(String[] args) {
		flowchartMover(200);
	}

	public static void flowchartMover(int A) {
		if (A > 2000) {
			System.out.println("A");
			if (A>6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println(1);
			if (A > 100) {
				System.out.println(3);
				if (A>600) {
					System.out.println(5);
				} else {
					System.out.println(4);
					if (A > 500) {
						System.out.println(6);
					} else {
						System.out.println(7);
					}
				}
			} else {
				System.out.println(2);
			}
		}

	}
}
