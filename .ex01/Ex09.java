package ex01;

/*
 interface
 값을 처리 하지않으면 에러가 발생한다
 안에는 public 을 사용한다 private를 사용하지 않는다.
 Main에서 클래스 는 변경이 가능하나 인터페이스는 불가한다.
 interface로 변수를 만들게되면 수정이 불가능하다.
 공통적으로 값이 같을 때 사용을 많이한다.
 */
interface Int01{
	public int num=100;
	public String path = "aaaa";
	
}

class A02{
	public final static int num = 100;//일반적으로 바로 호출할때는 static을 사용 쓰지않으면 호출 불가하다.
}

public class Ex09 implements CommonPath {
public static void main(String[] args) {

	System.out.println(Int01.num);
	System.out.println(A02.num);
//	A02.num = 12345;
//	Int01.num = 12345;
	System.out.println("저장합니다.");
	System.out.println(path);
	System.out.println(path);
	System.out.println(path);
	System.out.println(path);
	System.out.println(path);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
