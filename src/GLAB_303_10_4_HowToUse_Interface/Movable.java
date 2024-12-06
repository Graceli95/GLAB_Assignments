package GLAB_303_10_4_HowToUse_Interface;

//Create an Interface named Movable.

/**
 * An interface defines a list of public abstract methods to be implemented by the subclasses
 */
public interface Movable {
    void moveUp(); // "public" and "abstract" by default
    void moveDown();
    void moveLeft();
    void moveRight();
    String getCoordinate();
}
/**
 *Similar to an abstract class, an Interface cannot be instantiated
 because it is incomplete (the abstract method’s body is missing). To
 use an interface, you must derive subclasses and provide
 implementation to all of the abstract methods declared in the
 interface. The subclasses are now complete and can be
 instantiated.
 */
