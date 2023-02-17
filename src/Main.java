import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student student=new Student(17,"Aibek");
        Student student2=new Student(17,"Aibek");
        Student student3=new Student(17,"Aibek");
        Student student4=new Student(17,"Aibek");
        Student student5=new Student(17,"Aibek");
        LinkedList<Student>students=new LinkedList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        HashSet<Student>students2=new HashSet<>();
        students2.addAll(students);
        students2.forEach(System.out::println);


    }
}