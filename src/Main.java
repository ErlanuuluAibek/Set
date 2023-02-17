import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        LinkedList<Integer>integers=new LinkedList<>();
        int counter=0;
        for (int i = 0; i <= 400; i++) {
            integers.add(random.nextInt(20));
            counter+=integers.get(i);
        }
        for (Integer a:integers) {
            System.out.println(a);
        }
        System.out.println(" summa: "+ counter);
        HashSet<Integer>integers1=new HashSet<>();
        integers1.addAll(integers);
        int counter2=0;
        for ( Integer s:integers1) {
            counter2+=s;
        }
        System.out.println("summa: "+ counter2);


    }
}