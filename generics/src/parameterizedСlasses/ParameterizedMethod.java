package parameterizedСlasses;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(24);
        arr.add(51);

        int a = GenMethod.getSecondElement(arr);
        System.out.println(a);

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("Hello");
        arr2.add("Bye");
        arr2.add("Okay");

        String s = GenMethod.getSecondElement(arr2);
        System.out.println(s);


    }

}
