package ex01;

import java.util.Scanner;

class A지상군 implements 공방{

	@Override//@주석 처리 부여설명 보고 그 방향성을 보고 진행 된다
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("지상군 공격 해라라라라라라라라");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println("지상군 저새끼 막아아아아앙아아아아");
	}
	
}

class B공군 extends A지상군 implements 공방 {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("공군 날아가라라랄공겨겨겨겨격격");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println("공군 저넘 마가아앙아아아아");
	}
	
}
public class Ex08 {
public static void main(String[] args) {
	
	A지상군 지상군 = new B공군();
//	B공군 공군 = new B공군();
	System.out.println("빨갱이가 넘어왔습니둥");
	System.out.println("1. 지상군 2. 공군");
	Scanner sc = new Scanner(System.in);
	
	int choice = sc.nextInt();
	
	if(choice == 1) {
		System.out.println("지상군 선택하셨습니다");
	}else {
		System.out.println("공군선택 했습니다!!!!");
	}
	System.out.println("1.공격 2. 방어");
	int num = sc.nextInt();
	if(choice ==1 && num ==1) {
		지상군 = new A지상군();
		지상군.attack();
	}else if(choice ==2 && num ==1) {
		지상군.attack();
	}else if(choice ==2 && num ==2) {
		지상군.defense();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
