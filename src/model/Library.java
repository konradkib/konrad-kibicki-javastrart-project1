package model;

import java.util.Scanner;

public class Library {

    private final int  maxbooks = 1000;
    Book [] books = new Book[maxbooks];
    Scanner sc = new Scanner(System.in);
    private int booksNumber;




    public void addBook(Book book){
        if(booksNumber < maxbooks){
            books[booksNumber] = book;
            booksNumber++;
        }else{
            System.out.println("Maksymalna liczba książek została osiągnięta");
        }

    }

    public void printBooks(){
        if(booksNumber == 0) {
            System.out.println("Brak ksiażek w bibliotece");
        }

        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }


}
