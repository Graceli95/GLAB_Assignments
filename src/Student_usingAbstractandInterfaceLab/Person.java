package Student_usingAbstractandInterfaceLab;

public abstract class Person {
   private String firstName;
   private String lastName;
   private int age;

   public Person(){

   }
   public Person(String firstName, String lastName, int age){
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
   }
//   concrete method
   public String getFullName(){
       return this.firstName + " " + this.lastName;
   }
   public int getAge(){
       return this.age;
   }
//   abstract method
    public abstract void displayDetails();
}
