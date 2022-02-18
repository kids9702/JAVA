package Ch09;

public class C14Car {
	String owner;
	int speed;
	int fuel=1;
	
	//생성자메서드
	C14Car(String owner,int speed,int fuel){
		
		this.owner = owner;		//필드의 이름을 쓸 수 있게 해줌.
		this.speed = speed;
		this.fuel  = fuel;
		
		
	}
	
	
	//가속함수
	void Accel() {
		
		
		if(fuel-2<=0)
		{
			fuel=0;
			System.out.println("연료량이 바닥났습니다..");
			//연료량이 0이 되는 순간 속도증가는 불가능 "연료가 바닥이 났습니다" 가 출력
		}
		else
		{
			fuel=fuel-2; //함수사용시 마다 연료량은 2씩 감소
			
			if(speed+5>=200)//최대시속은 200Km/h 넘지는않습니다
			{
				speed=200;
				//200을초과할때는 "최대속도입니다. 주의하세요" 가 출력
				System.out.println("최대속도입니다. 주의하세요");
			}
			else
			{
				speed=speed+5; //함수사용시 마다 속도가 5씩 증가
				//200미만일때는 "가속합니다. 현재속도 : ? km/h" 가 출력
				System.out.println("가속합니다.현재속도 : " + speed+"Km/h");
			}		
		}
	
	}
	//감속함수
	void Break() {
		
		if(speed-10<=0)
		{
			speed=0;
			//음수값으로 떨어질때는 속도를 0으로 처리 ->"정지합니다" 가출력
			System.out.println("정지합니다..");
		}
		else
		{
			//함수 사용시마다 속도가 10씩 감소
			speed = speed-10;
			//속도가 0이 아닐때는 ->"감속합니다. 현재속도 : ? km/h" 가출력	
			System.out.println("감속합니다. 현재속도 : " +speed + "km/h");
		}

			
	}
	
	//정보확인
	void ShowInfo() 
	{
		System.out.println("소유자 : " + owner);//소유자
		System.out.println("현재속도 : " + speed);//현재속도
		System.out.println("연료량 : " + fuel);//연료량
	}	
		
		
}		




