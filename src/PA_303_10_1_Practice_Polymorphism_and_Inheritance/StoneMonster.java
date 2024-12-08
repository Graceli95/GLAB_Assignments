package PA_303_10_1_Practice_Polymorphism_and_Inheritance;

public class StoneMonster extends Monster implements TestMonster {
    @Override
    public void attack(){
        System.out.println("Attack with stone!");
    }
}
