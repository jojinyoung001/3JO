package ex01;

class T{}
class A01 implements TestIn{//implements를 사용해서 추상화를 가져온다 상속도 두개 연속으로 받을수있다

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("aaaa");
	}
	
}

public class Ex05 {
public static void main(String[] args) {
	
	TestIn t = new A01();
	t.test();
	
}
}
