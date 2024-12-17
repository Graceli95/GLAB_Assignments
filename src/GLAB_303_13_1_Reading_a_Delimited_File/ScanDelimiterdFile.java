package GLAB_303_13_1_Reading_a_Delimited_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * For separating a delimited file, we can use:
 * ➢ String class - has a split() method to identify the comma delimiter and split
 * the row into fields.
 * ➢ Scanner class - has a useDelimiter() method to identify the comma delimiter
 * and split the row into fields.
 * Objective:
 * In this Lab, we will demonstrate how to read a Delimited file by using Java. Below is one of
 * the processes:
 * ❑ Create an object of type file. Set it to your file’s path, and then we will pass this file
 * instance to the Scanner class for scanning. The Scanner class will read the file
 * line-by-line.
 * ❑ Use the nextLine() method to read a line.
 * ❑ Split the file by delimiter by using String.split() method.
 * ❑ After the split, we can store data in ArrayList. We could store that line as a String[]
 * array as shown below:
 * ➢ ArrayList<String[]>
 * ❑ After that, for display, we can Iterate through Arraylist.
 */
public class ScanDelimiterdFile {
    public static void main(String[] args) throws FileNotFoundException {

        try{
            String location = "/Users/FS/Documents/readFilesExample/cars.csv";
            File file = new File(location); //create an object of type file and pass in the file path
            Scanner input = new Scanner(file); //pass this file instance to the Scanner class for scanning, The Scanner class will read the file line-by-line.
            ArrayList<String[]> data = new ArrayList<String[]>();

//The hasNext() method verifies whether the file has another line,
//and the nextLine() method reads and returns the next line in the file.
            while(input.hasNextLine()){
                String Line = input.nextLine(); //Use the nextLine() method to read a line
                String[] splitedLine = Line.split(","); //Split the file by delimiter by using String.split() method

                data.add(splitedLine); //After the split, we can store data in ArrayList. We could store that line as a String[] array as shown below: ➢ ArrayList<String[]>
            }
//            After that, for display, we can Iterate through Arraylist.
            for(String[] line: data){
                //System.out.println(line[0] + "|" + line[1] + "|" + line[2] + "|" + line[3] + line[4] + "|" + line[5] + "|" + line[6] + "|" + line[7] + "|" + line[8]);
                System.out.println("Car Name :" + line[0]);
                System.out.println("MPG :" + line[1] );
                System.out.println("Cylinder :" + line[2] );
                System.out.println("Displacement :" + line[3]);
                System.out.println("Horsepower :" + line[4]);
                System.out.println("Weight :" + line[5]);
                System.out.println("Acceleration :" + line[6]);
                System.out.println("Model :" + line[7]);
                System.out.println("Origin :" + line[8]);
                System.out.println("===============================");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }

    }
}
