package abc;
import java.io.*;

public class WordFrequencyCounter {

	public static void main(String[] args) throws IOException {
		
		
		Dictionary<Word> dictionary = new Dictionary<Word>();
		Text<Word> text = new Text<Word>();
		FileIO.readFile(text, dictionary);
		MostFrequentWordsDictionary<Word> mostFrequentDictionary = new MostFrequentWordsDictionary<Word>();
		RareWordsDictionary<Word> rareWordsDictioanry = new RareWordsDictionary<Word>();
		FrequentWordsDictionary<Word> frequentWordsDictionary = new FrequentWordsDictionary<Word>();
		text.seperate(dictionary, rareWordsDictioanry, frequentWordsDictionary, mostFrequentDictionary);
		display(text,rareWordsDictioanry, frequentWordsDictionary, mostFrequentDictionary);
		
		
		
	    
	       
	    }
	public static void display(Text<Word> text,RareWordsDictionary<Word> rareWordsDictionary, 
			FrequentWordsDictionary<Word> frequentWordsDictionary, 
			MostFrequentWordsDictionary<Word> mostFrequentWordsDictionary) {
		System.out.println("Text: ");
		text.displayItems();
		System.out.println("-------------------------------------");
		System.out.println("Rare Words Disctionary: ");
		rareWordsDictionary.displayItems();
		System.out.println("-------------------------------------");
		System.out.println("Frequent Words Disctionary: ");
		frequentWordsDictionary.displayItems();
		System.out.println("-------------------------------------");
		System.out.println("Most Frequent Words Disctionary: ");
		mostFrequentWordsDictionary.displayItems();
		System.out.println("-------------------------------------");
	
		
	}
	

	
}
