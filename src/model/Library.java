package model;

import java.io.Serializable;
import java.util.Scanner;

public class Library implements Serializable {

    private static final int MAX_PUBLICATONS = 2000;
    private int publicationsNumber;
    private Publication[] publications = new Publication[MAX_PUBLICATONS];

    public Publication[] getPublications() {
        Publication [] result = new Publication[publicationsNumber];
        for (int i = 0; i < result.length; i++) {
            result[i] = publications[i];
        }
        return result;
    }

    public void addBook(Book book) {
        addPublication(book);
    }


    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    public void addPublication(Publication publication){
        if(publicationsNumber >= MAX_PUBLICATONS ){
            throw new ArrayIndexOutOfBoundsException("Max publication exceded " + MAX_PUBLICATONS);
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;


    }


}
