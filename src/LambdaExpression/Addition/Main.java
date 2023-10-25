package LambdaExpression.Addition;

public class Main {
    public static void main(String[] args) {
        Add sum=(a,b)->(a+b);
        System.out.println(sum.add(2,3));
    }
}
