package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(12, "Zaur", "Tregulov", 4000);
        Employee emp2 = new Employee(42, "Ivan", "Sidorov", 3500);
        Employee emp3 = new Employee(27, "Vlad", "Petrov", 4500);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting \n" + list);

        Collections.sort(list, new IdComparator());
        System.out.println("After sorting by [Id] \n" + list);

        Collections.sort(list, new NameComparator());
        System.out.println("After sorting by [Name] \n" + list);

        Collections.sort(list, new SalaryComparator());
        System.out.println("After sorting by [Salary] \n" + list);

    }
}
