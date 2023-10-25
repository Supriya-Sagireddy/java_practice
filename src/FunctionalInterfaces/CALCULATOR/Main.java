package FunctionalInterfaces.CALCULATOR;

public class Main{
    public static void main(String[] args) {
        Calculator addition=(a,b) -> (a+b);
        double result=addition.add(2.0,3.0);
        System.out.println("Addition of two nums= " +addition);
    }
}
