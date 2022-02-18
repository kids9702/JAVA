package Ch16;

abstract class Moonbanggu{
	static int sharpencnt=100;
	static int pencilcnt=100;
	abstract void write();	
}

class sharpen extends Moonbanggu{
	sharpen(){
		sharpencnt--;
	}
	void write() {System.out.println("샤프를 씁니다.");};
}

class pencil extends Moonbanggu{
	pencil(){
		pencilcnt--;
	}
	void write() {System.out.println("연필을 씁니다.");};
}

class Person{	
	
	void writepen(Moonbanggu gu) {	//Moonbanggu gu = new sharpen()
		gu.write();
	}
}

public class C02Prac {

	public static void main(String[] args) {

		//Moonbanggu obj = new Moonbanggu();
	}

}
