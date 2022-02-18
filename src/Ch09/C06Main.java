package Ch09;

public class C06Main {

	public static void main(String[] args) {
		
		C06Car hong = new C06Car();
		hong.owner="홍길동";
		hong.speed=100;
		hong.fuel=30;
		
		while(true)
		{
			hong.Accel();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
