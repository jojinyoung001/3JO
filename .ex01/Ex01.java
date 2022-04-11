package ex01;
class A{
	public void aaa() {
		System.out.println(" 부 모 ");
	}
}

class B extends A{
	public void aaa() {
		System.out.println("자식");
		
	}
	public void bbb() {
		System.out.println("bbbb");
	}
}
public class Ex01 {
public static void main(String[] args) {
	
	A b = new B(); //자식 형태에서 부모를 호출 한다 UpCasting 이라고 한다. 또느 Overaiding이라고 한다.
	b.aaa();
//	b.bbb(); 여기서 bbb는 호출이 불가하다.
	B bb = (B)b;//Down Casting
	bb.bbb();
	
//	B a = new A(); 부모 호출은 가능한데 자식이 부모를 호출해서 UpCasting,Down Casting은 불가능하다.
	
}
}
