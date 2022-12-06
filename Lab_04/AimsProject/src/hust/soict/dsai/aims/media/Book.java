package hust.soict.dsai.aims.media;

import java.util.*;

public class Book extends Media {

	private List<String> authors = new ArrayList<String>();
	public Book() {
		
	}
	public void addAuthor(String authorName){
	   boolean check = false;
	   for (int i= 0; i <authors.size(); i++) {
	   if (this.authors.get(i).equals(authorName)) {
		   System.out.println("The Author is already exist");
		   check = true;
	   }
	   
	   }
	   if (check == false) {
		   authors.add(authorName);
	   }
	   
   }
   public void removeAuthor(String authorName){
	   for (int i= 0; i <authors.size(); i++) {
		   if (this.authors.get(i).equals(authorName)) {
			   authors.remove(authorName);
		   }
		   
		   }	   
   }
   

}
