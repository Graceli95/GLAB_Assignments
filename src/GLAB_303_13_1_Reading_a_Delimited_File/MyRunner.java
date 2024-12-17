package GLAB_303_13_1_Reading_a_Delimited_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {
    public static void main(String[] args) {
        try{
            String location = "/Users/FS/Documents/readFilesExample/CourseData.csv";
            File file = new File(location); //create an object of type file and pass in the file path
            Scanner input = new Scanner(file); //pass this file instance to the Scanner class for scanning, The Scanner class will read the file line-by-line.
            ArrayList<Course> data = new ArrayList<>();
            while (input.hasNextLine()){
                String line = input.nextLine(); //Use the nextLine() method to read a line
                String[] splitedLine = line.split(","); //Split the file by delimiter by using String.split() method
//     course cObj1 = new course(splitedLine[0], splitedLine[1], splitedLine[2]);
            Course cObj = new Course();
            cObj.setCode(splitedLine[0]);
            cObj.setCourse_name(splitedLine[1]);
            cObj.setInstructor_name(splitedLine[2]);

            data.add(cObj); //After the split, we can store data in ArrayList.
            }

            for(Course c : data){
                System.out.println(c.getCode() + " | " + c.getCourse_name() + " | " + c.getInstructor_name());
                System.out.println("================================================");
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }
}
