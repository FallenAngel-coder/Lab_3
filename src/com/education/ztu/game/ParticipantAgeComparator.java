package com.education.ztu.game;

import java.util.Comparator;

public class ParticipantAgeComparator implements Comparator<Participant> {
    @Override
    public int compare(Participant first, Participant second) {
        return Integer.compare(first.getAge(), second.getAge());
    }
}
