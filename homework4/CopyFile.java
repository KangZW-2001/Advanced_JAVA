package homework4;

import java.io.*;

public class CopyFile {
	private static final String originalFile = "K:\\folder1\\了不起的盖茨比英文.txt";
	private static final String destFolder = "K:\\folder2";
	
	public static void main(String args[]) throws IOException {
		File file = new File(originalFile);
		String fileName = file.getName();
		File newFile = new File(destFolder, fileName);
		if(!newFile.exists()) {
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		InputStream fileInput = new FileInputStream(file);
		OutputStream fileOutput = new FileOutputStream(newFile);
		byte data[] = new byte[1024];
		while(fileInput.read(data) != -1) {
			fileOutput.write(data);
		}
		fileInput.close();
		fileOutput.flush();
		fileOutput.close();
	}

}
