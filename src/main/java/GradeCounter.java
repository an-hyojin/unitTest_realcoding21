public class GradeCounter {

    private int _maxNumberOfStudents;
    private int _numberOfStudents;
    private Student[] _students;
    private double _classAverageGPA;
    private int _numberOfStudentsAboveAverageGPA;

    public GradeCounter(int givenMaxNumberOfStudents) {
        this._maxNumberOfStudents = givenMaxNumberOfStudents;
        this._students = new Student[givenMaxNumberOfStudents];
        this._numberOfStudents = 0;
        _classAverageGPA = 0.0;
        _numberOfStudentsAboveAverageGPA = 0;
    }

    public boolean isFull() {
        if (_numberOfStudents >= _maxNumberOfStudents) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty() {
        if(_numberOfStudents == 0) {
            return true;
        }else {
            return false;
        }
    }

    public int maxNumberOfStudents() {
        return _maxNumberOfStudents;
    }

    public int numberOfStudents() {
        return _numberOfStudents;
    }

    public Student studentWithOrderOf (int i_th) {
        return _students[i_th];
    }

    public double classAverageGPA() {
        double sum = 0;
        for(int i = 0; i < _numberOfStudents ; i++) {
            sum = _students[i].score() + sum;
        }
        _classAverageGPA = sum /(double) _numberOfStudents;
        return _classAverageGPA;
    }

    public void addStudent (Student aStudent) {
        this._students[_numberOfStudents] = aStudent;
        _numberOfStudents++;
    }

    public int numberOfStudentsAboveAverageGPA() {
        for(int i = 0; i<_numberOfStudents; i++){
            if(_students[i].score()>=_classAverageGPA){
                _numberOfStudentsAboveAverageGPA++;}
        }
        return _numberOfStudentsAboveAverageGPA;
    }

}
