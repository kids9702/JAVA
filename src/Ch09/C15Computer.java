package Ch09;

public class C15Computer {
	//속성(멤버변수,필드)
	String SerialNo;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
	
	//생성자 추가하기
	//디폴트생성자 추가
	C15Computer(){
		SerialNo=""; CPUSpec="";RAMSpec="";DISKSpec="";
	}
	//모든 인자를 받는 생성자 추가
	C15Computer(String SNO, String CPU, String RAM, String DISK){
		SerialNo = SNO; CPUSpec = CPU; RAMSpec = RAM; DISKSpec = DISK;
	}
	
	//기능(멤버함수)
	void PowerON() {
		System.out.println(SerialNo + "전원을 켭니다");
	}
	void PowerOFF() {
		System.out.println(SerialNo + "전원을 끕니다");	
	}
	void ShowInfo() {
		System.out.println("S/N : " + SerialNo);
		System.out.println("CPUSpec : " + CPUSpec);
		System.out.println("RAMSpec : " + RAMSpec);
		System.out.println("DISKSpec : " + DISKSpec);
	}
}
