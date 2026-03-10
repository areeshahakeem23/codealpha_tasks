//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class GUI  implements ActionListener {
//    JFrame frame;
//    JLabel lName;
//    JTextField name ;
//    JLabel lRollNo;
//    JTextField roll_no ;
//    JLabel lGrades;
//    JTextField grades ;
//    JButton AddStudent;
//    JButton Report;
//    GUI(){
//        frame=new JFrame("STUDENT GRADE TRACKING SYSTEM");
//        frame.setLayout(null);
//        frame.setBounds(100, 100, 500, 400);
//        lName=new JLabel("NAME :");
//        lName.setBounds(40, 40, 100, 30);
//        name=new JTextField();
//        name.setBounds(160, 40, 250, 30);
//        lRollNo=new JLabel("Roll No: :");
//        lRollNo.setBounds(40, 90, 100, 30);
//        roll_no=new JTextField();
//        roll_no.setBounds(160, 90, 250, 30);
//        lGrades=new JLabel("Grades :");
//        lGrades.setBounds(40, 140, 100, 30);
//        grades=new JTextField();
//        grades.setBounds(160, 140, 250, 30);
//        AddStudent=new JButton("Add Student");
//        AddStudent.setBounds(80, 210, 140, 35);
//        Report=new JButton("Generate report");
//        Report.setBounds(260, 210, 160, 35);
//        frame.add(lName);
//        frame.add(name);
//        frame.add(lRollNo);
//        frame.add(roll_no);
//        frame.add(lGrades);
//        frame.add(grades);
//        frame.add(AddStudent);
//        frame.add(Report);
//        AddStudent.addActionListener(this);
//        Report.addActionListener(this);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//    public void actionPerformed(ActionEvent e) {
//        String StudentName=name.getText();
//        String StudentRollNo=roll_no.getText();
//        String StudentGrades= grades.getText();
//        if(e.getSource() == AddStudent){
//
//        }
//        if(e.getSource()==Report){
//
//        }
//    }
//}
//void main(String[]args) {
//    new GUI();
//    }



