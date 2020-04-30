package Lab2;

import java.io.*;
import java.util.*;

public class InputToProgram {

	public static Map<String, Integer> getMap() throws IOException {
		File file = new File(FileClass.getInput());
		Map<String, Integer> map = new TreeMap<>();
		Reader in = new FileReader(file);
		BufferedReader br = new BufferedReader(in);
		String line = null;
		while((line = br.readLine()) != null) {	
			String s[] = line.split(" ");
			for(int i = 0; i < s.length;i++){
				String ele = s[i];
				if(map.containsKey(ele)) {
					map.replace(ele, map.get(ele)+1);
				}
				else {
					map.put(ele, 1);
				}
			}
		}
		br.close();
		in.close();
		return map;
	}
}
