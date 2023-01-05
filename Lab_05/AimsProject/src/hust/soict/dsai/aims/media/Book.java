package hust.soict.dsai.aims.media;

import java.util.*;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	public Book(int id, String category, String title,float cost  , String author) {
		super(id, category, title, cost);
		authors.add(author);
	}
	public void addAuthor(String authorName) {
		boolean check = false;
		for (String string : authors) {
			if (string.equals(authorName)) {
				check=true;
			}
		}
		if(check == false) authors.add(authorName);
	}
	
	public void removeAuthor(String authorName) {
		for (int i = 0; i < authors.size(); i++) {
			if (authors.get(i).equals(authorName)) {
				authors.remove(i);
			}
		}
	}
	
	
}
