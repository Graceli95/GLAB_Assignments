package GLAB_303_11_1_GenericMethod_and_GenericClass;

public class myRunner {
    public static void main(String[] args) {
        // initialize the class with Integer data String data
        DemoClass dObj = new DemoClass();
        //invoke generic method
        dObj.genericsMethod(25); //passing int,initialize the class with Integer data
        dObj.genericsMethod("Per Scholas"); //passing String, initialize the class with String data
        dObj.genericsMethod(2563.5); //passing float


//initialize generic class with String and Integer data
        GMultipleDatatype mobj = new GMultipleDatatype<>("\nPer Scholas", 11025);
        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

//        initialize generic class with String and String data
        GMultipleDatatype mobj2 = new GMultipleDatatype<>("\nPer Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());


    }
}
