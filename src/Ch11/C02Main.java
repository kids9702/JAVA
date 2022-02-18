package Ch11;

public class C02Main {

	public static void main(String[] args) {

		C02Store GS감삼 = new C02Store(100000,100,100,1000,2000);
		C02Store GS반월당 = new C02Store(100000,100,100,2000,3000);
		
		C02Person Hong = new C02Person(50000);
		
		Hong.payment(GS감삼, 0, 2000); 
		System.out.println("--------- 1 Step -----------");
		System.out.println("--고객--");
		Hong.ShowInfo();
		System.out.println("--스토어(감삼)--");
		GS감삼.ShowInfo();
		
		Hong.payment(GS반월당, 1, 9000);
		System.out.println("--고객--");
		Hong.ShowInfo();
		System.out.println("--스토어(반월당)--");
		GS반월당.ShowInfo();
		
		
		
		
		
		
		
		
		
		
	}

}
