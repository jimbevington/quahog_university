package models;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private int id;
    private String name;
    private int age;
    private int enrolmentNo;
    private Course course;
    private Set<Lesson> lessons;

    public Student() {
    }

    public Student(String name, int age, int enrolmentNo, Course course) {
        this.name = name;
        this.age = age;
        this.enrolmentNo = enrolmentNo;
        this.course = course;
        this.lessons = new HashSet<Lesson>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnrolmentNo() {
        return enrolmentNo;
    }

    public void setEnrolmentNo(int enrolmentNo) {
        this.enrolmentNo = enrolmentNo;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Set<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(Set<Lesson> lessons) {
        this.lessons = lessons;
    }
}
