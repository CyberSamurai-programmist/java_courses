package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Ivan");
        list.add("Maria");

        System.out.println("List before sorting");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("List after sorting");
        System.out.println(list);
    }
}
