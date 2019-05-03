
public class Student {

    private String _studentNo;
    private int _score;


    public Student () {
        this._studentNo = null;
        this._score = 0;
    }

    public void setScore (int aScore) {
        this._score = aScore;
    }

    public int score () {
        return this._score;
    }

    public char grade() {
        char grade;
        if(_score >= 90 ) {
            grade = 'A';
        }
        else if (_score >= 80) {
            grade = 'B';
        }
        else if (_score >= 70 ) {
            grade = 'C';
        }
        else if (_score >= 60 ) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        return grade;
    }

    public void setStudentNo(String aStudentNo) {
        this._studentNo = aStudentNo;
    }

    public String studentNo() {
        return this._studentNo;
    }
}
