package singleton_pattern;

public class Spattern2 {
	
	private static Spattern2 a = null;
	private Spattern2() {
		// TODO Auto-generated constructor stub
	}
	public static Spattern2 fun2() {
		if(null == a) {
			a = new Spattern2();
		}
		return a;
	}
}
