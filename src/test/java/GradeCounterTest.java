import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
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

}
