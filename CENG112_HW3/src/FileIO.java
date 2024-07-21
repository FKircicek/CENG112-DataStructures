import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class FileIO {
	
	public static List<String> takeCommand(String fileName) throws IOException{
		File file = new File(fileName);
		List<String> commands = new ArrayList<String>();
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while((st = br.readLine())!= null) {
			commands.add(st);
		}
				
		return commands;
		
	}

}
