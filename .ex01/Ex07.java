package ex01;

class APerson1 implements 공방{

	public void reload() {
		System.out.println("총알 장전");
	}
	@Override
	public void attack() {
		reload();
		System.out.println("돌격 앞으로 총쏜다");
	}
	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}
}

class BPerson1 implements 공방{
	public void airplance() {
		System.out.println("비행기를 탑승합니다");
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		airplance();
		System.out.println("비행기가 공격합니다");
	}
	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}
}



public class Ex07 {
public static void main(String[] args) {

	APerson1 a = new APerson1();
	BPerson1 b = new BPerson1();
//	a.attack();
	공방 aaa = new BPerson1();//부모로 호출을하면 BPerson1에서 불필요한 매소드를 안볼수가 있다.
	aaa.attack();
	
}
}
