import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
public class StudentTest {
    @Test
    public void Student의_학번이_잘_들어갔는지_확인(){
        Student student = new Student();
        String studentNo = "201702037";
        student.setStudentNo(studentNo);
        assertThat(student.studentNo(), is(studentNo));
    }

    @Test
    public void Student의_점수가_잘_들어갔는지_확인(){
        Student student = new Student();
        student.setScore(90);
        assertThat(student.score(), is(90));
    }
    @Test
    public void Student의_grade를_확인(){
        Student student = new Student();
        student.setScore(30);
        assertThat(student.grade(), is('F'));
    }


}
