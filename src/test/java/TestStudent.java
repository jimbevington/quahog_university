import db.DBHelper;
import models.Course;
import models.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestStudent {

    private Student student;
    private Course course;

    @After
    public void tearDown() throws Exception {
        DBHelper.delete(student);
        DBHelper.delete(course);
    }

    @Before
    public void setUp() throws Exception {
        DBHelper.save(course);
        DBHelper.save(student);
    }

    @Test
    public void canSave() {
        List<Student> students = DBHelper.getAll(Student.class);
        assertEquals(1, students.size());
    }
}
