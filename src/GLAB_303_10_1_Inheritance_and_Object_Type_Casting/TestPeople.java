package GLAB_303_10_1_Inheritance_and_Object_Type_Casting;

public class TestPeople {
    public static void main(String[] args) {
//        Person person = new Person();
        Person aPerson;
        Boy jimmy;
        Girl betty;
        aPerson = new Person("Fred");
        jimmy = new Boy();
        betty = new Girl("Betty");

//        Boy b = new Person();  //throw error
//        Girl g = new Person();  //throw error
        System.out.println(aPerson);
        System.out.println(aPerson.talk());
        System.out.println(aPerson.walk());
        System.out.println();

        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();

        System.out.println(betty);
        System.out.println(betty.talk());
        System.out.println(betty.walk());
        System.out.println();

        System.out.println((Person) jimmy);
        System.out.println(((Person)jimmy).talk());
        System.out.println();

        System.out.println(((Person)betty).talk());
        System.out.println(((Person)betty).walk());
        System.out.println();

        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan);
        System.out.println(Girl.lifeSpan());

        // System.out.println(((Boy)aPerson).talk());

    }
}
