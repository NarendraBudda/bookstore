package com.bookstore;

public class Author {
    private String authorName;
    private String authorPenName;


    public Author(String authorName,String authorPenName){
        this.authorName=authorName;
        this.authorPenName=authorPenName;
    }

    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public String getAuthorName(){
        return authorName;
    }
    public void setAuthorPenName(String authorPenName){
        this.authorPenName=authorPenName;
    }
    public String getAuthorPenName() {
        return authorPenName;
    }

    public String toString() {
        return "Author {  Author Name : " + getAuthorName() + " ,Author Pen Name:  " + getAuthorPenName() + " }";
    }
}
