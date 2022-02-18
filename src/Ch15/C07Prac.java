package Ch15;

class Moonbanggu{
	static int sharpencnt=100;
	static int pencilcnt=100;
	void write() {};	//완성된 메서드
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

public class C07Prac {

	public static void main(String[] args) {
//		Moonbanggu gu = null;
//		gu=new sharpen();	//UPCasting
//		gu.write();
//		gu=new pencil();	//UPCasting
//		gu.write();			//UPCasting

		Person Hong = new Person();
		Hong.writepen(new sharpen());
		Hong.writepen(new pencil());
		
	}

}
