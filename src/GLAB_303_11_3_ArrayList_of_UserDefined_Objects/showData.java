package GLAB_303_11_3_ArrayList_of_UserDefined_Objects;

import java.util.ArrayList;

public class showData {
    public static void main(String[] args) {
        // instantiation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> myBookList = b.bookDetails();

        for (Book bookValue: myBookList) {

            // ---- invoking getter method for getting Data---------
            System.out.println(bookValue.getNumber() + " " + bookValue.getName() +" "+ bookValue.getCategory() +" "+ bookValue.getAuthor());

            //  System.out.println(bookValue);
        }












    }
}
