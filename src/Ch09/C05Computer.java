package Ch09;

public class C05Computer {
	//속성(멤버변수,필드)
	String SerialNo;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
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
