package models;

import com.sun.tools.javah.Gen;

import javax.persistence.*;

@Entity
@Table(name="lessons")
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "classroomNo")
    public int getClassroomNo() {
        return classroomNo;
    }

    public void setClassroomNo(int classroomNo) {
        this.classroomNo = classroomNo;
    }

    @ManyToOne
    @JoinColumn(name="course", nullable = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
