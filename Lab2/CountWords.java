package Lab2;

import java.io.IOException;

public class CountWords implements UserOption{
	@Override
	public void getAnswer(String in, String out) throws IOException{
		// TODO Auto-generated method stub
		FileClass.setInput(in);
		FileClass.setOutput(out);
		OutputToFile.output(Handle.getStringArray(InputToProgram.getMap()));
		
	}
}

