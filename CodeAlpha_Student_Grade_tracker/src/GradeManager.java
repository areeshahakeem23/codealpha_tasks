import java.util.ArrayList;
public class GradeManager {
    ArrayList<Student> list=new ArrayList<>();
    double average;
    Student HighestMarks;
    Student LowestMarks;
    public void CalculateAverage() {
        if (list.isEmpty()) return;
        double sum = 0;
        for (Student s : list) {
            sum += s.getAverage();
        }
        average = sum / list.size();
    }
    public double CalculateHighestMarks(){
        if (list.isEmpty()) return 0;

        HighestMarks = list.get(0);   // assume first is highest

        for (Student s : list) {
            if (s.getAverage() > HighestMarks.getAverage()) {
                HighestMarks = s;
            }
        }
        return HighestMarks.getAverage();
    }
    public double CalculateLowestMarks(){
        if (list.isEmpty()) return 0;
        LowestMarks = list.get(0);
        for (Student s : list) {
            if (s.getAverage() < LowestMarks.getAverage()) {
                LowestMarks = s;
            }
        }
        return LowestMarks.getAverage();
    }
    public void showSummary() {
        System.out.println("\n--- Summary Report ---");
        for (Student s : list) {
            System.out.println("Name: " + s.name +
                    " | Roll: " + s.roll_no +
                    " | Avg: " + s.getAverage());
            System.out.println("-------------");
            System.out.println("highest marks:"+CalculateHighestMarks());
            System.out.println("lowest marks :"+CalculateLowestMarks());
        }
    }
}
