package PA_303_10_1_Practice_Polymorphism_and_Inheritance;

/**
 * Scenario: In our game app, we have many types of monsters that can attack. You
 * will design a superclass called Monster and define the method of attack() in the
 * superclass. You will design subclasses called FireMonster, WaterMonster, and
 * StoneMonster. The subclasses will then provide their actual implementation. In
 * the main program, we will declare instances of the superclass, substitute them
 * with the actual subclass, and invoke the method defined in the superclass
 */
public abstract class Monster {
    String name;
    public abstract void attack();
}

/**
 * Inheritance: In the Java language, classes can be derived from other classes, thereby
 * inheriting fields and methods from those classes. A class that is derived from another
 * class is called a subclass (also a derived class, extended class, or child class). The
 * class from which the subclass is derived is called a superclass (also a base class or a
 * parent class).
 * Polymorphism: When a superclass reference is used to refer to a subclass object.
 */