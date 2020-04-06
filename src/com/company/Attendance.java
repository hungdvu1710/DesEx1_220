package com.company;

import java.util.HashSet;
import java.util.Set;

public class Attendance {
    private Set<Double> swiped = new HashSet<>();

    public void swipe(Student student){

        this.swiped.add(student.getId());
    }
    public void reset(){
        //reset the swiped list after the teachers finish checking attendance
        this.swiped.removeAll(swiped);
    }
    public boolean checkAttendance(Student student){
        if(!swiped.contains(student.getId())){
            return false;
        }
        return true;
    }
}
