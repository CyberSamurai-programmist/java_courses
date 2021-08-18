package game;

public class Main {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan",16);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olya", 14);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 19);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 40);


        Team <Schoolar> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team <Schoolar> schoolarTeam2 = new Team<>("Bunny");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);

        Team <Student> studentTeam = new Team<>("Dogs");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team <Employee> employeeTeam = new Team<>("Vendetta");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

    }
}
