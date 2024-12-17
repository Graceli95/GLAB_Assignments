package GLAB_303_13_1_Reading_a_Delimited_File;

/**
 * Example 2
 * Let’s make our code more professional using the concept of “Encapsulation.”
 * Another way of handling a delimited file is by creating something called a Model, Pojo, or Entity.
 * A Model is simply a class containing variables with getter() methods and setter() methods,
 * corresponding to each column of the delimited file and containing everything a normal class
 * can contain.
 * Assume that you have ‘course’ information in the form of a CSV file. As a developer, it is
 * your responsibility to extract data from a file, and then display the data in a console. Finally,
 * you import data into the database. This process is called ETL (Extract Transformation Load).
 * Let’s see first how we can extract/read data from a CSV file in a professional way.
 */
public class Course {
    private String code, course_name, instructor_name;

    public Course(String code, String course_name, String instructor_name) {
        this.code = code;
        this.course_name = course_name;
        this.instructor_name = instructor_name;
    }
    public Course(){

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getInstructor_name() {
        return instructor_name;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }
}
/*
If you notice, that class has only private variables, constructors, getters(), and setters() for
each variable, so we can say it is Encapsulation.
 */
//Create a class named MyRunner.

