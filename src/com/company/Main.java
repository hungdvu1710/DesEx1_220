package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1 = new Student("bob",35123);
        Student s2 = new Student("mar",012312);
        Attendance ad = new Attendance();
        ad.swipe(s1);
        System.out.println(ad.checkAttendance(s1));
        System.out.println(ad.checkAttendance(s2));
    }
}
