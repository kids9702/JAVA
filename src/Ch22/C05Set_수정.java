package Ch22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class C05Set_수정 {

	public static void main(String[] args) {

		//로또 개수 6개
		//숫자 1~45
		Random ran = new Random();
		Set<Integer> set = new HashSet();
		while(set.size()<6) {
			set.add(ran.nextInt(45)+1);
		}
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		
		List<Integer> lotto = new ArrayList(set);
		Collections.sort(lotto);
		for(int i=0;i<lotto.size();i++) {
			System.out.print(lotto.get(i)+ " ");
		}
		
		
		
			
		

	}

}
