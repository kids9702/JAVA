package Ch22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C06Map {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap();
		map.put("aaa", 1111);
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("aaa", 1111);	//key가 동일하면 나중의 것을 저장
		
		System.out.println("총 저장개수 : " + map.size());
		
		//MAP 내부 데이터 순회
		Set<String> set = map.keySet();	//모든키를 set전달
		Iterator<String>iter = set.iterator();
		while(iter.hasNext()) {	//다음위치에 키가 있는지 확인
			String key = iter.next();	//키 임시 저장
			Integer value = map.get(key);	//키 전달을 통해 Value 받음
			System.out.println("KEY : "+key+" VAL : "+value);
		}
		map.remove("bbb");	//단일 삭제
		map.clear(); 		//모두 삭제
		
	}

}
