package GLAB_303_11_3_ArrayList_of_UserDefined_Objects;

/**
 * Since ArrayList supports generics, you can create an ArrayList of any data type. It can
 * be of simple types such as Integer, String, or Double, or complex types such as
 * an ArrayList of ArrayLists, an ArrayList of HashMaps, or an ArrayList of any
 * user-defined objects.
 * Lab Objective
 * In the following lab, you will learn how to create an ArrayList of user-defined objects.
 * We will utilize Arraylist, constructors, getters, and setters. This concept is very
 * important for future lectures such as DAO, Hibernate, and Spring Boot.
 * By the end of this lab, learners will be able to utilize the ArrayList of user-defined objects.
 * A user-defined object is a class you create to represent something in your program, like a Person, Car, or Book.
 * Each object is an instance of this class and can have its attributes (fields) and behaviors (methods).
 *
 * An ArrayList is a dynamic array in Java that can hold multiple elements.
 * Instead of holding primitive data types (e.g., int or String), it can hold objects of a class.
 * This allows you to create collections, like a list of all books in a library.
 * Why use an ArrayList?
 * It can grow dynamically (no fixed size).
 * You can add, remove, and modify objects in the list.
 */


//create a new class named "Book"
public class Book {
    private int number;
    private String name;
    private String author;
    private String category;

//    Constructor with arguments

    public Book(int number, String name, String author, String category) {
        this.number = number;
        this.name = name;
        this.author = author;
        this.category = category;
    }

//    Constructor without arguments
    public Book() {}

//    setters and getters

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
