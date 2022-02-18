package Ch04;


public class C01TypeChange {
	
	public static void main(String[] args) {
		//형변환 : 자료의 형태가 강제로 바뀌거나 자동으로 바뀌어지는 현상
		//자동형변환(암시적형변환) : 컴파일러가 진행
		//강제형변환(명시적형변환) : 프로그래머가 진행
		//데이터의 손실을 최소화하는 방향으로 형변환이 진행됨
		//byte<short<int<long<float<double
		
		//자동형변환
		byte byteval = 10;
		int intval = byteval;	//자동형변환 O
		
		char charval = '가';
		intval = charval;		//자동형변환 O
		
		
		long longval = intval;	//자동형변환 O
		
		float floatval =100.5f;
		intval = (int)floatval;		//자동형변환 X ->강제형변환
		
		
		
		
		
		//test
		
		
		
		
		
		
		
		
		

	}

}
