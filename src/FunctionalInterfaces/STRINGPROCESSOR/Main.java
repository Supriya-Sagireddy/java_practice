package FunctionalInterfaces.STRINGPROCESSOR;

public class Main {
    public static void main(String[] args) {
        StringProcessor Processor=(input) ->input + "Processed";
        String result= Processor.process("Input string ");
        System.out.println("modified string= "+Processor);
    }
}
