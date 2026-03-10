import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        GradeManager g=new GradeManager();
        int choice;
        do{
            System.out.println("--------menu--------");
            System.out.println("1.add a student");
            System.out.println("2.show report summary");
            System.out.println("3.show lowest marks");
            System.out.println("4.show highest marks");
            System.out.println("5.exit");
            System.out.println("--------------------");
            System.out.println("enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("enter student name");
                    String name=sc.nextLine();
                    System.out.println("enter roll_no");
                    String roll_no=sc.nextLine();
                    System.out.println(" enter  English grades");
                    double EngGrades=sc.nextDouble();
                    System.out.println(" enter  Urdu grades");
                    double UrduGrades=sc.nextDouble();
                    System.out.println(" enter  Maths grades");
                    double MathGrades=sc.nextDouble();
                    System.out.println(" enter  Science grades");
                    double SciGrades=sc.nextDouble();
                    System.out.println(" enter  Islamiyat grades");
                    double IslGrade=sc.nextDouble();
                    System.out.println(" enter your Pakstudy grades");
                    double PakStudyGrades=sc.nextDouble();
                    Student s=new Student(name,roll_no,EngGrades,UrduGrades,MathGrades,SciGrades,IslGrade
                            ,PakStudyGrades);
                    s.CalculateTotal();
                    s.CalculateStudentAverage();
                    g.CalculateHighestMarks();
                    g.CalculateLowestMarks();
                    g.list.add(s);
                     break;
                case 2:
                    System.out.println("----summary----");
                    g.showSummary();
                    break;
                case 3:
                    g.CalculateLowestMarks();
                    System.out.println("lowest marks are "+g.LowestMarks.getAverage());
                    break;
                case 4:
                    g.CalculateHighestMarks();
                    System.out.println("highest marks are a:"+g.HighestMarks.getAverage());

                    break;
                case 5:
                    System.out.println("exitting.......");
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice.....try again");
            }
        }while (true);
    }

}
