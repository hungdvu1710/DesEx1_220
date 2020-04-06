package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AttendanceTest {
    Attendance ad;
    @Before
    public void setUp() throws Exception {
        ad = new Attendance();
    }
    @Test
    public void testSwipe(){
        Student s1 = new Student("bob",123);
        Student s2 = new Student("marry", 01231);
        assertEquals(false,ad.checkAttendance(s1));
        ad.swipe(s1);
        assertEquals(true,ad.checkAttendance(s1));
        assertEquals(false,ad.checkAttendance(s2));
    }
    @Test
    public void testCheckAttendance(){
        Student s1 = new Student("bob",12031);
        Student s2 = new Student("marry",12312);
        Student s3 = new Student("notCoolName",2312);
        assertEquals(false,ad.checkAttendance(s1));
        assertEquals(false,ad.checkAttendance(s2));
        ad.swipe(s3);
        assertEquals(true,ad.checkAttendance(s3));
        assertEquals(false,ad.checkAttendance(s1));
        ad.swipe(s2);
        assertEquals(true,ad.checkAttendance(s2));
    }
    @Test
    public void testReset(){
        Student s1 = new Student("bob",12031);
        Student s2 = new Student("marry",12312);
        Student s3 = new Student("notCoolName",2312);
        ad.swipe(s3);
        assertEquals(true,ad.checkAttendance(s3));
        ad.swipe(s2);
        assertEquals(true,ad.checkAttendance(s2));
        ad.reset();
        assertEquals(false,ad.checkAttendance(s3));
        assertEquals(false,ad.checkAttendance(s2));
        assertEquals(false,ad.checkAttendance(s1));
    }
}