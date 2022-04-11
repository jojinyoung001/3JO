wqckage Main;

import java.util.Scanner;


import BBB.B;

import C.C;
import D.D;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		CommonSeting com = null;
		while (true) {
			System.out.println("1.A 2.B 3.C 4.D");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				break;
			case 2:
				com = new B();
				break;
			case 3:
				com = new C();
				break;
			case 4:
				com = new D();
				
				break;

			}
			com.whoname();
			com.기능();
		}

	}
}
