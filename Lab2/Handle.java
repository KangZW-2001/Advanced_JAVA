package Lab2;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Handle {

	private static String getString(Map<String,Integer> map,Integer i) {
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		String re;
		while(it.hasNext()) {
			re = it.next();
			 if(map.get(re) == i) {
				 return re;
			 }
		}
		return null;
	}
	
	public static String [] getStringArray(Map<String, Integer> map) throws IOException {
		Set<String> keySet = map.keySet();
		LinkedList<Integer> valueList = new LinkedList<Integer>();
		Iterator<String> keyIt = keySet.iterator();
		int number = 0;
		while(keyIt.hasNext()) {
			String key = keyIt.next();			
			Integer i = map.get(key);
			char a[] = key.toCharArray();
			if(a.length != 0) {
				valueList.add(i);
				number++;
			}
		}
		Collections.sort(valueList);
		String str[] = new String [number];		
		int t = 0;
		while(true) {
			if(valueList.isEmpty()) {
				break;
			}
			Integer value = valueList.getLast();
			valueList.removeLast();
			String strtemp = getString(map, value);
			map.remove(strtemp);
			String result = strtemp + " " + value.toString();
						
			str[t] = result;
			t++;
		}		
		return str;
	}

}
