package com.education.ztu;

import com.education.ztu.game.Participant;
import com.education.ztu.game.ParticipantAgeComparator;
import com.education.ztu.game.Schoolar;
import com.education.ztu.game.Student;
import com.education.ztu.game.Team;

import java.util.Collections;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        Team<Student> studentTeam = new Team<>("Vpered");
        studentTeam.addNewParticipant(new Student("Mykola", 20));
        studentTeam.addNewParticipant(new Student("Anna", 21));
        studentTeam.addNewParticipant(new Student("Olena", 18));
        studentTeam.addNewParticipant(new Student("Anna", 19));

        Team<Schoolar> schoolarTeam = new Team<>("Dragon");
        schoolarTeam.addNewParticipant(new Schoolar("Bohdan", 14));
        schoolarTeam.addNewParticipant(new Schoolar("Alina", 15));
        schoolarTeam.addNewParticipant(new Schoolar("Alina", 13));

        System.out.println("Студенти до сортування: " + studentTeam.getParticipants());
        System.out.println("Школярі до сортування: " + schoolarTeam.getParticipants());

        Collections.sort(studentTeam.getParticipants());
        Collections.sort(schoolarTeam.getParticipants());
        System.out.println("Студенти за іменем: " + studentTeam.getParticipants());
        System.out.println("Школярі за іменем: " + schoolarTeam.getParticipants());

        ParticipantAgeComparator ageComparator = new ParticipantAgeComparator();
        studentTeam.getParticipants().sort(ageComparator);
        schoolarTeam.getParticipants().sort(ageComparator);
        System.out.println("Студенти за віком: " + studentTeam.getParticipants());
        System.out.println("Школярі за віком: " + schoolarTeam.getParticipants());

        Comparator<Participant> nameAndAgeComparator = Comparator.comparing(Participant::getName)
                .thenComparingInt(Participant::getAge);
        studentTeam.getParticipants().sort(nameAndAgeComparator);
        schoolarTeam.getParticipants().sort(nameAndAgeComparator);
        System.out.println("Студенти за іменем і віком: " + studentTeam.getParticipants());
        System.out.println("Школярі за іменем і віком: " + schoolarTeam.getParticipants());
    }
}
