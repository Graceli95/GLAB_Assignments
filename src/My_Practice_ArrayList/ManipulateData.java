package My_Practice_ArrayList;

import java.util.ArrayList;

public class ManipulateData {

    public ArrayList<Car> addData() {
        ArrayList<Car> carArrayList = new ArrayList<>();
//       carArrayList.clear();
        Car car = new Car();
        Car car1 = new Car("red", "Toyota", 2024);

        carArrayList.add(car1);
        carArrayList.add(new Car("blue", "Toyota", 2025));
        carArrayList.add(new Car("yellow", "Toyota", 2026));

       return carArrayList;

    }
}
