package abc;

import java.io.*;

public class FileIO {

	public static void readFile(Text<Word> text, Dictionary<Word> dictionary) throws IOException {
		String[] data = takeWordsFromFile();
		for(int i=0; i<data.length;i++) {
			Word word = convertWord(data[i]);
			text.add(word);
			if(!dictionary.contains(word))
				dictionary.add(word);	
			
		}
	}
	private static String[] takeWordsFromFile() throws IOException {
		File file = new File(
	            "text.txt");
			String result = "";
			String[] words;
	        @SuppressWarnings("resource")
			BufferedReader br
	            = new BufferedReader(new FileReader(file));

	        String st;
	        while ((st = br.readLine()) != null) {
	        	result +=st;
	        }
	        words = result.split(" ");
	        for(int i = 0; i<words.length;i++) {
	        	words[i] = cleanWord(words[i]);
	        }
	        
		return words;
		
	}
	private static String cleanWord(String word) {
		String cleanWord = "";
		for(int i=0;i<word.length();i++) {
			char c = word.charAt(i);
			if(Character.isAlphabetic(c)) 
				cleanWord += c;
				
		}
		return cleanWord;
		
	}
	private static Word convertWord(String word) {
		return new Word(word,word.length());
		
	}

}
