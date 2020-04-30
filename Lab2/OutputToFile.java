package Lab2;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class OutputToFile {

	public OutputToFile() {
		// TODO Auto-generated constructor stub
	}
	
	public static void output(String array[]) throws IOException {
		File outputFile = new File(FileClass.getOutput());
		if(!outputFile.exists()) {
			outputFile.createNewFile();
		}
		PrintWriter pr = new PrintWriter(outputFile);
		for(int i = 0; i < array.length; i++) {
			pr.println(array[i]);
		}
		pr.flush();
		pr.close();
	}

}
