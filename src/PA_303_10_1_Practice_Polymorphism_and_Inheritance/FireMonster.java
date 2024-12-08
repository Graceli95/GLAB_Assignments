package PA_303_10_1_Practice_Polymorphism_and_Inheritance;

public class FireMonster extends Monster implements TestMonster {
    @Override
    public void attack(){
        System.out.println("Attack with fire!");
    }
}
