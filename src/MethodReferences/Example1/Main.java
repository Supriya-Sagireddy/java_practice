package MethodReferences.Example1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>();
        strings.add("supriya");
        strings.add("suppu");
        strings.add("chups");
        strings.add("chuppu");
        strings.add("toffee");
        strings.sort(String::compareTo);
        for (String str : strings){
            System.out.println(str);
        }

    }

}
