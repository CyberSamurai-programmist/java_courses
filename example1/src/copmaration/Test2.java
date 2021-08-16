package copmaration;

import java.util.*;


/**
 * Интерфейс Comparable используется для сравнения объектов,
 * используя естественный порядок.
 * int compareTo(Element e) override
 */

/**
 * Интерфейс Comparator используется для сравнения объектов,
 * используя НЕ естественный порядок.
 * int compare(Element e1, Element e2) override
 */

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 5300);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6400);
        Employee emp3 = new Employee(123, "Maria", "Sidorov", 7800);

        //Arrays.sort - exception during runtime, if not overridden compareTo()
        //Arrays.sort(new Employee[]{emp1, emp2, emp3});

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n" + list);

        // Comparable interface
        Collections.sort(list);

        // Comparator interface
        Collections.sort(list, new IdCopmarator());
        Collections.sort(list, new NameCopmarator());
        Collections.sort(list, new SalaryCopmarator());

        System.out.println("After sorting \n" + list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee obj) {
        if (this.id == obj.id) {
            return 0;
        } else if (this.id < obj.id) {
            return -1;
        } else {
            return 1;
        }

        // return this.id - obj.id;

        /* Integer and String class implements Comparable
                return this.id.compareTo(obj.id);
                return this.name.compareTo(obj.name);
         */

    }
}

class IdCopmarator implements Comparator<Employee> {
    @Override
    public int compare(Employee obj1, Employee obj2) {
        if (obj1.id == obj2.id) {
            return 0;
        } else if (obj1.id < obj2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameCopmarator implements Comparator<Employee> {
    @Override
    public int compare(Employee obj1, Employee obj2) {
        return obj1.name.compareTo(obj2.name);
    }
}

class SalaryCopmarator implements Comparator<Employee> {
    @Override
    public int compare(Employee obj1, Employee obj2) {
        return obj1.salary - obj2.salary;
    }
}