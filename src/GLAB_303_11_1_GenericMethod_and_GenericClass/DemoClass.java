package GLAB_303_11_1_GenericMethod_and_GenericClass;

/**example: generic method
 * We can create a method that can be used with any type of data. That
 * method is known as the Generics Method.
 */

//Create a class named DemoClass. Then create a generic method in this class:
public class DemoClass {
//    create a generic method
    public <T> void genericsMethod(T data) {
        System.out.println("Generic Method");
        System.out.println("Data passed: " + data);

    }
}
/**
 * the type parameter <T> is inserted after the public modifier and before the return type void.
 *
 * We can call the generics method by placing the actual type
 * <String> and <Integer> inside the bracket before the method name.
 */
