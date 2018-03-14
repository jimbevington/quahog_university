import db.DBHelper;
import models.Course;
import models.Lesson;
import models.Student;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Course course1 = new Course("French", "PhD");
        DBHelper.save(course1);

        Lesson lesson1 = new Lesson("Verbs", 4, course1);
        DBHelper.save(lesson1);
        Lesson lesson2 = new Lesson("Adverbs", 5, course1);
        DBHelper.save(lesson2);

        Student student1 = new Student("Horace", 7, 12345, course1);
        DBHelper.save(student1);
        Student student2 = new Student("June", 99, 12346, course1);
        DBHelper.save(student2);

        Student foundStudent = DBHelper.find(Student.class, student1.getId());
        Lesson foundLesson = DBHelper.find(Lesson.class, lesson1.getId());

        DBHelper.addStudentToLesson(foundStudent, foundLesson);

        List<Student> allStudents = DBHelper.getAll(Student.class);
        List<Lesson> allLessons = DBHelper.getAll(Lesson.class);
        List<Course> allCourses = DBHelper.getAll(Course.class);

    }

}
