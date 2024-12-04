package Student_usingAbstractandInterfaceLab;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "Johnson", 20, "Computer Science");
        Student student2 = new Student("Bob", "Smith", 22, "Mathematics");
        student1.displayDetails();
        student1.study();
        System.out.println();

        student2.displayDetails();
        student2.study();
    }
}
