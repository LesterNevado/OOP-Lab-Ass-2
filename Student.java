import java.util.*;
public class Student {
    private String studentNo;
    private String name;
    private String program;
    private Integer totalUnitsEnrolled;
    private ArrayList<Course> courseList;

    //setters
    public void setStudentNo(String studentNo){
        this.studentNo=studentNo;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setProgram(String program){
        this.program=program;
    }
    public void setTotalUnitsEnrolled(Integer totalUnitsEnrolled){
        this.totalUnitsEnrolled=totalUnitsEnrolled;
    }
    public void setCourseList(ArrayList<Course> courseList){
        this.courseList=courseList;
    }

    //getters
    public String getStudentNo(){
        return studentNo;
    }
    public String getName(){
        return name;
    }
    public String getProgram(){
        return program;
    }
    public Integer getTotalUnitsEnrolled(){
        return totalUnitsEnrolled;
    }
    public ArrayList<Course> getCourseList(){
        return courseList;
    }

    public String toString(){
        String studentOutput = new String();
        studentOutput += "Student Number: " + studentNo + 
                         "\nStudent name: " + name + 
                         "\nProgram: " + program + 
                         "\nTotal units enrolled: " + totalUnitsEnrolled + "\n";

        studentOutput += "\nCourse Code\t" + 
                         "Description\t\t" + 
                         "Units\t" + 
                         "Day\t" + 
                         "Time\n";

        for(Course course: courseList){
             studentOutput += course;
       }
        studentOutput += "\n";
        return studentOutput;
    }
}