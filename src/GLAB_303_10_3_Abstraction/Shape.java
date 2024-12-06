package GLAB_303_10_3_Abstraction;

/**
 * In the previous lab (GLAB - 303.10.2), we used examples of Shapes. We
 * created Circle, Rectangle, and Triangle objects. The Shape class can only be
 * used as a superclass for Inheritance and Polymorphism purposes; it cannot
 * be used for objects. The class that is not used for creating objects is known
 * as abstract.
 * Using an abstract class, you can improve the Shape class that was shown in
 * the previous lab (GLAB - 303.10.2). Since there is no meaningful concept of
 * area for an undefined two-dimensional shape, the following version of the
 * program declares getArea( ) as an abstract method inside the Shape
 * class. This means that all classes derived from the Shape class must
 * override getArea( ).
 * Remember that we cannot instantiate the Abstract class; so there is no
 * need to create a Constructor in the Abstract class. We will remove the
 * constructor from the Shape class and make a few changes in all subclasses
 * accordingly.
 */
public abstract class Shape {
    protected String color;
    protected double height;
    protected double width;
    protected double base;
    public void setColor(String color) {
        this.color = color;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setBase(double base) {
        this.base = base;
    }
// The getArea method is abstract.
// It must be overridden in a subclass.
/** All shapes must provide a method called getArea() */
    public abstract double getArea();
    /** Returns a self-descriptive string */
    public String toString() {
        return "Shape[color=" + color + "]";
    }
    public void displayshapName()
    {
        System.out.println("I am a Shape.");
    }
}
