package GLAB_303_10_2_Polymorphism_Inheritance_Overriding_ObjectTypeCasting;

public class Rectangle extends Shape {
    public Rectangle(String color) {
        super(color);
    }
 public Rectangle(){

    }
  public Rectangle(String color, double area, double base, double width, double height) {
        super(color, area, base, width, height);
  }

  public void setBase(double base) {
        super.base = base;
  }
  public void setWidth(double width) {
        this.width = width;
  }
  public double getArea(){
        return width * height;
  }
  public double perimeter(){
        super.area = super.width * super.height;
        return super.area;
  }
    //Overriding method of base class with different implementation
    @Override
    public void displayShapeName() {
        System.out.println("I am a Rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle[height=" + height + ", width=" + width + super.toString() + "]";

    }
}
