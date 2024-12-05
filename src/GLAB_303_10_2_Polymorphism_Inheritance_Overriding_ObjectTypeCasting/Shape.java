package GLAB_303_10_2_Polymorphism_Inheritance_Overriding_ObjectTypeCasting;

/**
 * By the end of this lab, learners will be able to use Polymorphism
 * concepts using Inheritance, Encapsulation, and instanceOF objects.
 *
 * One of the key features of Inheritance is that a reference
 * variable (Object) of a superclass type can point to an object of
 * its subclass. Polymorphism is the art of taking advantage of this
 * simple but powerful and versatile feature.
 */

/**
 * Consider the following illustration:
 * Suppose that our program uses many kinds of Shapes,
 * such as triangles, rectangles, and so on. We should design
 * a superclass called Shape, which defines the public
 * (common) behaviors of all the shapes.
 * For example, we would like all shapes to have a method
 * called getArea(), which returns the area of that particular
 * shape.
 */
//Shape is a parent class
public class Shape {
    private String color;
    protected double area = 1.0;
    protected double base = 1.0;
    protected double width = 1.0;
    protected double height = 1.0;

    /** Constructs a Shape instance with only the given color */
    public Shape(String color){
        this.color = color;
    }
    public Shape(){

    }
    /** Constructs a Shape instance with the given values */
    public Shape(String color, double area, double base, double width, double height) {
        this.color = color;
        this.area = area;
        this.base = base;
        this.width = width;
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /** Returns a self-descriptive string */
//    @Override
//    public String toString() {
//        return "Shape[color =" + color + "]";
//    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", area=" + area +
                ", base=" + base +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    /** All shapes must provide a method called getArea() */
    public double getArea() {
        System.out.println("Shape unknown! Cannot compute area!");
        return 0;
    }
    public void displayShapeName(){
        System.out.println("I am a shape.");
    }
}
