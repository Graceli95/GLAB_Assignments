package GLAB_303_11_1_GenericMethod_and_GenericClass;

/**
 *
 *Example: Generic Class
 * A class can have more than one type parameter. In this case, the type
 * parameters are separated by a comma.
 * For the demonstration, we will initialize two type parameters in the
 * Generic class. The names of the parameter types will be Datatypeone and
 * DatatypeTwo, but these are only names. You are free to use “X” or “Z,” or
 * any other identifier to name parameters.
 */
public class GMultipleDatatype <DataTypeOne, DataTypeTwo> {
    DataTypeOne valueOne;
    DataTypeTwo valueTwo;

    public GMultipleDatatype(DataTypeOne v1, DataTypeTwo v2) {
        this.valueOne = v1;
        this.valueTwo = v2;
    }

    public DataTypeOne getValueOne() {
        return valueOne;
    }

    public void setValueOne(DataTypeOne valueOne) {
        this.valueOne = valueOne;
    }

    public DataTypeTwo getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(DataTypeTwo valueTwo) {
        this.valueTwo = valueTwo;
    }
}
