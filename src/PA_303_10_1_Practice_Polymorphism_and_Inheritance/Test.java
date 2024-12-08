package PA_303_10_1_Practice_Polymorphism_and_Inheritance;

public class Test {
    public static void main(String[] args) {
        //declare instances of superclass, but substituted by subclasses
         StoneMonster stoneMonster1 = new StoneMonster(); //upcasting
        stoneMonster1.attack(); // Invoke the actual implementation

        Monster fireMonster1 = new FireMonster();//upcasting
        fireMonster1.attack();
        Monster waterMonster1 = new WaterMonster();//upcasting
        waterMonster1.attack();
    }
}
