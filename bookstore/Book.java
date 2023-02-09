package com.bookstore;

public class Book {
    private int ISBNNumber;
    private String title;
    private String description;
    private double price;
    private Author author;

    public void setISBNNumber(int ISBNNumber){
        this.ISBNNumber=ISBNNumber;
    }
    public int getISBNNumber(){
        return ISBNNumber;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle() {
        return title;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setAuthor(Author author){
        this.author=author;
    }
    public Author getAuthor(){
        return author;
    }


  public void displaydetails(){
      System.out.println("ISBN Number : "+getISBNNumber()+" ,Book Title : "+getTitle()+" ,Description : "+getDescription()+" ,price : "+getPrice()+" ,"+getAuthor());

  }



}
