package ex01;
class AAA{
	public void aaa(Object a) {
		int num = (int)a;//object 부모를 int 자식 형태로 변환을 시켜준다 
		// 연산이 불가능 하기 때문에 형 변화를 시켜줘야 된다
		System.out.println(a);
	}
}


public class Ex02 {
public static void main(String[] args) {
	/*
	 Object
	 모든 문자열 정수 의 조상이다 
	 예)String int flot등을 = Object 를 사용
	 대신 int 대신 사용할때는 계산이 불가능 하다.
	 */
	
	
	AAA a = new AAA();
	a.aaa(1111);
	
	/*
	a.aaa("1111");
	a.aaa(11.11);
	
	AAA aa = new AAA();
	a.aaa(aa);
	*/
	
	
}
}
