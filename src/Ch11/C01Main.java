package Ch11;

class Gun{
	String SNO;
	String Type;
	Gun(String SNo, String type){
		SNO=SNo;
		Type=type;
	}
	void fire() {
		System.out.println(Type+" 방아쇠를 당깁니다.");
	}
	
}

class Police{
	
		Gun gun;
		
		
		void setGun(Gun tmp) {	//경찰객체에 총객체를 연결
			gun=tmp;
		}
		
		void returngun() {		//경찰객체가 연결하고 있는 총객체 제거
			gun=null;
		}
	
	
}

public class C01Main {

	public static void main(String[] args) {

		Gun 권총1 = new Gun("1010","권총-1010");
		Gun 권총2 = new Gun("1011","권총-1011");
		Gun 샷건 = new Gun("2020","샷건-2020");
		Gun 저격총 = new Gun("3030","저격총-3030");
		
		
		Police 홍길동 = new Police();
		홍길동.setGun(권총1);
		홍길동.gun.fire();
		
		홍길동.setGun(권총2);
		홍길동.gun.fire();
		
		홍길동.setGun(샷건);
		홍길동.gun.fire();
		
		홍길동.setGun(저격총);
		홍길동.gun.fire();
		

	}

}
