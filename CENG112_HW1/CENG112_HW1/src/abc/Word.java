package abc;

import java.util.Objects;

public class Word {
	private String content;
	private int length;
	
	public Word() {
		
	}
	public Word(String content, int length) {
		this.content = content;
		this.length = length;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(content, other.content) && length == other.length;
	}
	@Override
	public String toString() {
		return "Word [content=" + content + ", length=" + length + "]";
	}
	

}
