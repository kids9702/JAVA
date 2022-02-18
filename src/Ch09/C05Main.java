package Ch09;

public class C05Main {

	public static void main(String[] args) {
		C05Computer LGGram0101 = new C05Computer();
		C05Computer Flex0102 = new C05Computer();
		LGGram0101.SerialNo="0101";
		LGGram0101.CPUSpec="I7";
		LGGram0101.RAMSpec="16G";
		LGGram0101.DISKSpec="500G";
		LGGram0101.PowerON();
		LGGram0101.ShowInfo();
		LGGram0101.PowerOFF();

	}

}
