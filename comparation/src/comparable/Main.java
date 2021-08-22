package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(12, "Zaur", "Tregulov", 4000);
        Employee emp2 = new Employee(42, "Ivan", "Sidorov", 3500);
        Employee emp3 = new Employee(27, "Vlad", "Petrov", 4500);

        // Without implementation, Comparable will throw an exception at runtime
        //      Arrays.sort(new Employee[]{emp1, emp3, emp3});

        System.out.println("Sorting Arrays.sort() \n" + list);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting \n" + list);

        Collections.sort(list);

        System.out.println("After sorting \n" + list);

    }
}
