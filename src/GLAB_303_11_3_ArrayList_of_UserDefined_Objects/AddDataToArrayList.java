package GLAB_303_11_3_ArrayList_of_UserDefined_Objects;

import java.util.ArrayList;
import java.util.List;

//Create a new Class named “AddDataToArrayList,”
public class AddDataToArrayList {
    public ArrayList<Book> bookDetails() {

        //User-defined class objects in Java ArrayList
        ArrayList<Book> booksList = new ArrayList<>();

        // Passing data using Constructors
        Book b1 = new Book(1, "Death note", "John", "cartoon");
        Book b2 = new Book(2, "Stranger Things", "brothers", "suspense");
        Book b3 = new Book(3, "Spider man", "Alex", "Kids");
        Book b4 = new Book(4, "GentleMen", "Max", "Action");

        //passing data using setter
        Book b5 = new Book();
        b5.setNumber(5);
        b5.setName("Java FullStack");
        b5.setAuthor("Flex");
        b5.setCategory("Programming");

        //In the above class, as a demonstration, we are passing Data to Book class by using the constructor, and by using the setter method.


        // Adding Books objects to Arraylist, here the ArrayList name is called booksList
        booksList.add(b1);
        booksList.add(b2);
        booksList.add(b3);
        booksList.add(b4);
        booksList.add(b5);

        return booksList;
    }





}
