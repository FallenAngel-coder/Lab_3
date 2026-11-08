package com.education.ztu;

import com.education.ztu.game.Student;
import com.education.ztu.game.Team;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("Mykola", 20);
        Student studentCopy = (Student) student.clone();

        System.out.println("Оригінал: " + student);
        System.out.println("Клон: " + studentCopy);
        System.out.println("equals: " + student.equals(studentCopy));
        System.out.println("hashCode оригіналу: " + student.hashCode());
        System.out.println("hashCode клону: " + studentCopy.hashCode());
        System.out.println("Однакові посилання: " + (student == studentCopy));

        studentCopy.setAge(21);
        System.out.println("Змінений клон: " + studentCopy);
        System.out.println("equals після зміни: " + student.equals(studentCopy));

        Team<Student> team = new Team<>("Vpered");
        team.addNewParticipant(student);
        team.addNewParticipant(new Student("Viktoria", 21));

        Team<Student> teamCopy = new Team<>(team);
        System.out.println("Учасники оригіналу: " + team.getParticipants());
        System.out.println("Учасники копії: " + teamCopy.getParticipants());
        System.out.println("Однакові списки: " + (team.getParticipants() == teamCopy.getParticipants()));
        System.out.println("Однакові учасники: "
                + (team.getParticipants().get(0) == teamCopy.getParticipants().get(0)));

        teamCopy.getParticipants().get(0).setName("Petro");
        System.out.println("Оригінал після зміни копії: " + team.getParticipants());
        System.out.println("Змінена копія: " + teamCopy.getParticipants());
    }
}
