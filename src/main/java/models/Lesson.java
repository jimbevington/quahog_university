package models;

public class Lesson {

    private int id;
    private String title;
    private int classroomNo;
    private Course course;

    public Lesson() {
    }

    public Lesson(String title, int classroomNo, Course course) {
        this.title = title;
        this.classroomNo = classroomNo;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getClassroomNo() {
        return classroomNo;
    }

    public void setClassroomNo(int classroomNo) {
        this.classroomNo = classroomNo;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
