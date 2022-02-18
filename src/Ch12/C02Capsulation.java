package Ch12;

//캡슐화
//특정 목적달성을 위해 객체에 여러 기능들을 하나로 묶는 작업
//캡슐화는 정보은닉을 수반한다(무조건 정보은닉은 아님, 일부 혹은 전부일수도 있다)


//캡슐화 과정에 공정에 대한 잘못된 이해를 바탕으로 만들게 되면
//전체 프로세스에 결함이 발생할 확률이 높기 때문에
//정확한 공정에 대한 이해를 바탕으로 코드 작성을 해야 한다.

class Carengine{
	//흡입->압축->폭발->배기
	private void Induction() {System.out.println("연료 + 공기 흡입");}
	private void Compress() {System.out.println("피스톤이 상승하면서 흡기밸브 닫힘");}
	private void Power() {System.out.println("피스톤이 UP/DOWN 과정거치며 폭발");}
	private void Exhaust() {System.out.println("배기밸프 오픈/배기가스 방출");}
	
	public void EnginStart() {
		Induction();
		Compress();
		Power();
		Exhaust();
			
		
	}
	
	
}	


class C02Car{
	
	private Carengine engin = new Carengine();
	
	String owner;
	
	C02Car(String owner){
		this.owner=owner;		
	}
	
	public void Start() {
		System.out.println(owner + " 님의 자동차 시동을 켭니다.");
		engin.EnginStart();
		
	}
}

public class C02Capsulation {

	public static void main(String[] args) {

		C02Car avantee1 = new C02Car("홍길동");
		avantee1.Start();

	}

}
