package model;

import java.io.Serializable;

public abstract class Publication implements Serializable {

    private int year;
    private String title;
    private String publisher;

    public Publication(String title, String publisher,int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;

    }

    @Override
    public String toString() {
        return title + ", " + publisher + ", " + year;
    }
}
