package parameterizedСlasses;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        Not corrected
//        List<Number> list = new ArrayList<Integer>();
//        List<Object> list = new ArrayList<Integer>();

//        Wildcards
        List<?> list = new ArrayList<String>();

//        Bounded wildcards
        List<? extends Number> list2 = new ArrayList<Integer>();
        List<? super Number> list3 = new ArrayList<Object>();

        List<Double> listDouble = new ArrayList<>();
        listDouble.add(3.14);
        listDouble.add(3.15);
        listDouble.add(3.16);
        showListInfo(listDouble);

        List<String> listString = new ArrayList<>();
        listString.add("Hello");
        listString.add("Bye");
        listString.add("Okay");
        showListInfo(listString);

        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(3.14);
        arrayList.add(3.15);
        arrayList.add(3.16);
        System.out.println(summ(arrayList));

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(33);
        arrayList2.add(55);
        arrayList2.add(26);
        System.out.println(summ(arrayList));

    }

    static void showListInfo(List<?> list) {
        System.out.println("My list contains the following items: " + list);
    }

    public static double summ(ArrayList<? extends Number> arrayList) {
        double summ = 0;
        for (Number n : arrayList) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
