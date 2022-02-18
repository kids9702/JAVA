package Ch17;

interface Searchable{
	void Search(String url);
}

interface Remocon{
	//속성(public static final)
	int MAX_VOL=10;
	int MIN_VOL=0;
	//기능(추상메서드)
	void TurnON();
	void TurnOFF();
	void SetVolumn(int vol);
}
class TV implements Remocon{
	int volumn;
	@Override
	public void TurnON() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void TurnOFF() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void SetVolumn(int vol) {
		if(vol>=MAX_VOL) {//볼륨최대치
			this.volumn=MAX_VOL;
		}else if(vol<=MIN_VOL) {
			this.volumn=MIN_VOL;
		}else {
			this.volumn=vol;
		}
		System.out.println("현재 볼륨 : "+volumn);	
	}
	public void Search(String url) {
		System.out.println(url + " 을 검색합니다.");
	}
	
}
class Radio implements Remocon{

	@Override
	public void TurnON() {
		System.out.println("라디오를 켭니다.");
		
	}

	@Override
	public void TurnOFF() {
			System.out.println("라디오를 끕니다.");
			}

	@Override
	public void SetVolumn(int vol) {
		// TODO Auto-generated method stub
		
	}
	
}
class Person{
	public Remocon controller;
		
	}

public class C01Main {

	public static void main(String[] args) {
		Person Hong = new Person();
		TV tv = new TV();
		Hong.controller=tv;
		Hong.controller.TurnON();
		Hong.controller.SetVolumn(11);
		Hong.controller.SetVolumn(7);
		Searchable search = (Searchable) tv;
		search.Search("www.naver.com");
		
		
		Hong.controller=new Radio();
		Hong.controller.TurnON();
		Hong.controller.TurnOFF();

	}

}
