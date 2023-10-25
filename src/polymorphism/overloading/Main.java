package polymorphism.overloading;

public class Main {
    public static void main (String [] args){
        MathOperations math = new MathOperations();
        AdvancedMathOperations AdvancedMath = new AdvancedMathOperations();
        System.out.println("MathOperations:");
        System.out.println("Add two nummbers:" + math.add(5,3));
        System.out.println("Add three numbers:" + math.add(5,4,3));
        System.out.println("AdvancedMathOperations:");
        System.out.println("Mutiply two numbers:" + AdvancedMath.multiply(4,5));
        System.out.println("Multiply three numbers:" + AdvancedMath.multiply(4,5,6));

    }
}
