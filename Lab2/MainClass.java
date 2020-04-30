package Lab2;

import java.io.IOException;

public class MainClass {
	public static void main(String args[]) throws IOException {
		UserOption user = new CountWords();
		user.getAnswer("K:\\folder2\\了不起的盖茨比英文.txt", 
				"K:\\folder1\\output.txt");
	}
}
