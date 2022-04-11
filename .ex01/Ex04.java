package ex01;

abstract class Abstract{//추상화 = abstract
	protected int num;
	
	public void setNum(int num) {
		this.num = num;
	}
	public abstract void combo();
}

class class01 extends Abstract{

	@Override
	public void combo() {
		// TODO Auto-generated method stub
		System.out.println(num + "단 콤보 공경 + 발차기 기술");
	}
}

public class Ex04 {
public static void main(String[] args) {
	class01 c = new class01();
	c.setNum(5);
	c.combo();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
