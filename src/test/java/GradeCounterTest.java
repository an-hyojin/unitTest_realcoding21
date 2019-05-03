import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class GradeCounterTest {

    @Test
    public void 학생의_수가_잘_count되는지_확인(){
        Student student_01 = new Student();
        Student student_02 = new Student();
        student_01.setScore(80);
        student_02.setScore(50);
        GradeCounter gradeCounter = new GradeCounter(5);
        gradeCounter.addStudent(student_01);
        gradeCounter.addStudent(student_02);

        assertThat(gradeCounter.numberOfStudents(),is(2));
    }

    @Test
    public void 학생정보가_배열에_들어가는지_확인(){
        Student student_01 = new Student();
        Student student_02 = new Student();
        student_01.setScore(80);
        student_02.setScore(50);
        GradeCounter gradeCounter = new GradeCounter(5);
        gradeCounter.addStudent(student_01);
        gradeCounter.addStudent(student_02);

        assertThat(gradeCounter.studentWithOrderOf(1),is(student_02));
    }

    @Test
    public void 최대학생수_확인(){
        GradeCounter gradeCounter = new GradeCounter(4);
        assertEquals(gradeCounter.maxNumberOfStudents(),4);
    }

    @Test
    public void isEmpty_상태를_확인(){
        GradeCounter gradeCounter = new GradeCounter(5);
        assertTrue(gradeCounter.isEmpty());
    }

    @Test
    public void Class_GPA를_확인(){
        Student student_01 = new Student();
        Student student_02 = new Student();
        Student student_03 = new Student();
        Student student_04 = new Student();
        student_01.setScore(80);
        student_02.setScore(50);
        student_03.setScore(90);
        student_04.setScore(35);

        GradeCounter gradeCounter = new GradeCounter(5);
        gradeCounter.addStudent(student_01);
        gradeCounter.addStudent(student_02);
        gradeCounter.addStudent(student_03);
        gradeCounter.addStudent(student_04);
        double GPA = (double) (80+50+90+35)/(double)4;
        assertThat(gradeCounter.classAverageGPA(),is(GPA));

    }

}
