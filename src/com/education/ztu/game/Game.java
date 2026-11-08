package com.education.ztu.game;

public class Game {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Student student1 = new Student("Mykola", 20);
        Student student2 = new Student("Viktoria", 21);
        Employee employee1 = new Employee("Andriy", 28);
        Employee employee2 = new Employee("Oksana", 25);
        Team<Schoolar> schoolarTeam = new Team<>("Dragon");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team<>("Vpered");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        Team<Employee> employeeTeam = new Team<>("Robotyagi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Rozumnyky");
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olga", 14);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        Team<Student> studentTeam2 = new Team<>("Fantaziya");
        studentTeam2.addNewParticipant(new Student("Anna", 19));
        studentTeam2.addNewParticipant(new Student("Petro", 22));

        Team<Employee> employeeTeam2 = new Team<>("Maystry");
        employeeTeam2.addNewParticipant(new Employee("Roman", 30));
        employeeTeam2.addNewParticipant(new Employee("Olena", 26));

        schoolarTeam.playWith(schoolarTeam2);
        studentTeam.playWith(studentTeam2);
        employeeTeam.playWith(employeeTeam2);
    }
}
