package LambdaExpression.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Collections.sort(numbers, (a,b) -> a.compareTo(b));
        System.out.println("Integers in descending order= " + numbers);
    }
}
