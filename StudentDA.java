import java.util.*;
import java.io.*;
public class StudentDA {
    private ArrayList<Student> studentList;
    private Integer totalStudents;

    public StudentDA(String blockCode) throws FileNotFoundException{
        Scanner studentInput = new Scanner(new FileReader("studentInfo.csv"));
        studentList = new ArrayList<>();
        totalStudents = 0;

        while(studentInput.hasNext()){
            String studentRow = new String();
            studentRow = studentInput.nextLine();
            String[] studentRowSpecific = new String[4];
            studentRowSpecific = studentRow.split(",");

            if(blockCode.equals(studentRowSpecific[0].trim())){
                Student student = new Student();
                student.setStudentNo(studentRowSpecific[1].trim());
                totalStudents++;
                student.setName(studentRowSpecific[2].trim());
                student.setProgram(studentRowSpecific[3].trim());
                
                CourseDA courseDA = new CourseDA(student.getStudentNo());
                student.setCourseList(courseDA.getCourseList());
                student.setTotalUnitsEnrolled(courseDA.getTotalUnitsEnrolled());

                studentList.add(student);
            }
            
        }
        studentInput.close();
    }

    public ArrayList<Student> getStudentList(){
        return studentList;
    }
    public Integer getTotalStudents(){
        return totalStudents;
    }
}
