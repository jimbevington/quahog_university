package models;

import com.sun.tools.javah.Gen;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="lessons")
public class Lesson {

    private int id;
    private String title;
    private int classroomNo;
    private Course course;
    private Set<Student> students;

    public Lesson() {
    }

    public Lesson(String title, int classroomNo, Course course) {
        this.title = title;
        this.classroomNo = classroomNo;
        this.course = course;
        this.students = new HashSet<Student>();
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

    @ManyToMany(mappedBy = "lessons", fetch = FetchType.LAZY)
    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}
