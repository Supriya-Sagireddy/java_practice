package polymorphism.overloading;

public class AdvancedMathOperations extends MathOperations{
    public int multiply(int a , int b){
        return(a * b);
    }
    public int multiply(int a, int b, int c){
        return (a*b*c);
    }
}
