package ex01;

import java.util.Scanner;

class Parents{
	public void familyName() {
		System.out.println("이");
	}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}

class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("국주");
	}
}

class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("기광");
	}
}

public class Ex03 {
public static void main(String[] args) {
	
	
	
	
	Parents par = new Parents();
	Scanner input = new Scanner(System.in);
	int num ;
	System.out.println("1. 부모 이름 ");
	System.out.println("2. 딸 이름");
	System.out.println("2. 아들 이름");
	
	num = input.nextInt();
	if(num == 1) {
		
	}else if(num == 2) {
		par = new Daughter();
		
	}else {
		par = new Son();
	}
	par.name();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
