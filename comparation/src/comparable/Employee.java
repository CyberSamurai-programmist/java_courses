package comparable;

public class Employee implements Comparable<Employee> {
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
    public int compareTo(Employee anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
    }

    // Different implementations of compareTo()
    //      return this.id - anotherEmp.id;

    // When using the wrapper class Integer or String,
    // the comparison is implemented internally by the
    // compareTo () method
    //      return this.id.compareTo(anotherEmp.id);
    //      return this.name.compareTo(anotherEmp.name);
}
