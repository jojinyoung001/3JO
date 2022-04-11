package ex01;
class APerson{
	public void landAtack() {
		reload();
		System.out.println("돌격 앞으로 총쏜다");
	}
	public void reload() {
		System.out.println("총알 장전");
	}
}

class BPerson{
	public void airplance() {
		System.out.println("비행기를 탑승합니다");
	}
	public void attAck() {
		airplance();
		System.out.println("비행기가 공격합니다");
	}
}

public class Ex06 {
public static void main(String[] args) {
	APerson a = new APerson();
	BPerson b = new BPerson();
	a.landAtack();
	b.airplance();

	
	
	
	
	
}
}
