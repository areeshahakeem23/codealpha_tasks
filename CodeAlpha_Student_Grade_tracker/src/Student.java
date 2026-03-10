public class Student {
    final int Subjects=6;
    String name;
    String roll_no;
    double EngGrades,UrduGrades,MathGrades,SciGrades,IslGrade,PakStudyGrades;
    double StudentTotal;
    double StudentAverage;
    Student(String name,String roll_no,double EngGrades,double UrduGrades,double MathGrades,double SciGrades,double IslGrade,double PakStudyGrades){
        this.name=name;
        this.roll_no=roll_no;
        this.MathGrades=MathGrades;
        this.EngGrades=EngGrades;
        this.UrduGrades=UrduGrades;
        this.IslGrade=IslGrade;
        this.PakStudyGrades=PakStudyGrades;
        this.SciGrades=SciGrades;
    }

    public void CalculateTotal(){
        StudentTotal=EngGrades+UrduGrades+SciGrades+MathGrades+IslGrade+PakStudyGrades;
    }
    public void CalculateStudentAverage(){
        StudentAverage=StudentTotal/Subjects;
    }

    public double getAverage() {
        return StudentAverage;
    }
}
