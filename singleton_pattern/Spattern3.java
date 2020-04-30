package singleton_pattern;

public class Spattern3 {

	private static class inner{
		private static Spattern3 a = new Spattern3();
	}
	
	private Spattern3() {
		// TODO Auto-generated constructor stub
	}
	public static Spattern3 fun() {
		return inner.a;
	}

}
