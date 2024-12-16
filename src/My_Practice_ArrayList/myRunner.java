package My_Practice_ArrayList;

import java.util.ArrayList;

public class myRunner {
    public static void main(String[] args) {
        ManipulateData c = new ManipulateData();
        ArrayList<Car> carList = c.addData();
        System.out.println(c.addData());  //print the whole ArrayList
        for(Car car: carList){
            System.out.println(car);
        } //iterate through our Car ArrayList
    }
}
