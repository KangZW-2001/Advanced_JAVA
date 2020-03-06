package singleton_pattern;

public class Spattern1 {

	private static Spattern1 s = new Spattern1();
	
	private Spattern1() {
		// TODO Auto-generated constructor stub
	}
	
	public static Spattern1 fun() {
		return s;
	}

}
