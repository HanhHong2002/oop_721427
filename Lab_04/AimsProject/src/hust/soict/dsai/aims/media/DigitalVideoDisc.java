package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {
	
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.getTitle() = title;
        this.category = category;
        this.cost = cost;
        this.id = nbDigitalVideoDisc++;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private String director;
    private int length;
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = nbDigitalVideoDisc++;
    }

    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }

    private static int nbDigitalVideoDisc = 0;

    @Override
    public String toString() {
        return id+". DVD - " + title + " - " + category + " - " +director + " - " + length + " : " + cost + "$";
    }
    public boolean isMatch(String title){
        if(this.title.equals(title))
            return true;
        return false;
    }
}
