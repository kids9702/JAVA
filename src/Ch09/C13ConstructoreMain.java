package Ch09;

//디폴트생성자가 아닌 임의로 생성자를 추가하는 경우
//디폴트생성자를 명시하지 않으면 사용할 수 가 없다.
class C13Simple{
	int x;
	int y;
	
	//생성자(인자값 1개)
	C13Simple(int x){
		this.x=x;
		y=0;
		System.out.println("인자1 생성자 호출");
	}
		//디폴트생성자(생성자가 1이상일을때는 필요시 넣어준다)
		C13Simple(){
			x=0;y=0;
			System.out.println("디폴트 생성자 호출");
			
		}
		C13Simple(int x, int y){
			this.x=x;
			this.y=y;
			System.out.println("인자2 생성자 호출");
		}
		
	
	//메서드
	void ShowInfo() {
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
	
}


public class C13ConstructoreMain {

	public static void main(String[] args) {
		
		C13Simple obj1 = new C13Simple();	//디폴트생성자 이용 객체 생성
		obj1.ShowInfo();
		System.out.println();
		C13Simple obj2 = new C13Simple(100);	//C13Simple(int x)생성자 호출
		obj2.ShowInfo();
		System.out.println();
		C13Simple obj3 = new C13Simple(100,200);
		obj3.ShowInfo();

	}

}
