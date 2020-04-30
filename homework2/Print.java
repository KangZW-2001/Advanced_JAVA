package homework2;
import java.util.*;


public class Print {

	public static Set<Map.Entry<String, Integer>> getEntrySet(String[] s) {
		List<String> list = Arrays.asList(s);
		Map<String, Integer> map = new TreeMap<>();
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String ele = it.next();
			if(map.containsKey(ele)) {
				map.replace(ele, map.get(ele)+1);
			}
			else {
				map.put(ele, 1);
			}
		}
		return map.entrySet();
	}

	public static void print(String[] s) {
		Set<Map.Entry<String, Integer>> set = getEntrySet(s);
		Iterator <Map.Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	

}
