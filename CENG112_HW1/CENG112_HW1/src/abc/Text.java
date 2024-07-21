package abc;

@SuppressWarnings("hiding")
public class Text<Word> extends Bag<Word>{

	public Text() {
		super();
		
	}

	public Text(int capacity) {
		super(capacity);
		
	}
	public void seperate(Dictionary<Word> dictionary,RareWordsDictionary<Word> rareWordsDictionary, 
			FrequentWordsDictionary<Word> frequentWordsDictionary, 
			MostFrequentWordsDictionary<Word> mostFrequentWordsDictionary) {
		
		for(Word dictionaryWord: dictionary.toArray()) {
			int counter = 0;
			for(Word textWord:this.toArray()) {
				if(dictionaryWord.equals(textWord)) {
					counter++;
				}
			}
			if(counter<5) {
				rareWordsDictionary.add(dictionaryWord);
			}else if(5 < counter && counter <8) {
				frequentWordsDictionary.add(dictionaryWord);
			}else {
				mostFrequentWordsDictionary.add(dictionaryWord);
			}
				
				
				
		}
		
	}

}
