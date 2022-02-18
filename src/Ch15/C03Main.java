package Ch15;

class Computer{
	
	String Prodnum;
	Computer(String PN){
		Prodnum=PN;
		System.out.println("컴퓨터 생성자 호출!");
		}
	
	public void PowerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void PowerOff() {
		System.out.println("전원을 끕니다");
	}
	
		
}

class Notebook extends Computer{
	
	int battery;
	Notebook(String PN,int b){
		super(PN);
		battery=b;
		System.out.println("노트북 생성자 호출!");
	}
	public void move() {
		battery-=5;
		System.out.println(Prodnum + "제품이 이동합니다.");
	}
	
	
}

class Tablet extends Notebook{

	int PenNum;
	
	Tablet(String PN,int b, int P){
		super(PN,b);
		PenNum=P;
		System.out.println("태블릿 생성자 호출!");		
		
	}
	public void write() {
		battery-=3;
		System.out.println(PenNum + "펜을 씁니다.");
	}
		
	
}





public class C03Main {

	public static void main(String[] args) {
		
		Tablet iPad = new Tablet("0101",100,1234);
		iPad.write();
		iPad.move();
		
		
		

	}

}
