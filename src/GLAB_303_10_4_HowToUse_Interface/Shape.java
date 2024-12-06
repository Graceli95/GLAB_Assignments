package GLAB_303_10_4_HowToUse_Interface;

/**
 * In the previous lab (GLAB - 303.10.3), we demonstrated that an
 * abstract class has both methods with bodies, and methods with no
 * bodies (abstract methods). You learned that abstract methods must
 * be overridden in a subclass
 */

/**
 * By the end of this lesson, learners will be able to use Java interfaces.
 * An Interface is similar to an abstract class with no fields and all
 * abstract methods. Interfaces cannot be instantiated — they can
 * only be implemented by classes. The purpose of an Interface is to
 * specify behavior for a class.
 * In other words, we can say that an Interface is a design contract. It
 * specifies methods and classes that can "implement" the Interface;
 * and thereby, sign the contract.
 * We will use the Shapes example in this lab.
 * Suppose that our application involves many shapes that can
 * move. We could define an interface as movable, containing
 * the signatures of the various movement methods.
 */

//Create a class named Shape. This will be an Abstract class and a Super class.
public abstract class Shape {
    protected String color;
    protected double height; // To hold height.
    protected double width; //To hold width
    protected double base; //To hold base
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

