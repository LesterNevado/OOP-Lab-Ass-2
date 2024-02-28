import java.util.*;
public class BlockSection {
    private String blockCode;
    private String description;
    private String adviser;
    private Integer totalStudents;
    private ArrayList<Student> studentList;

    //setters
    public void setBlockCode(String blockCode){
        this.blockCode=blockCode;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setAdviser(String adviser){
        this.adviser=adviser;
    }
    public void setTotalStudents(Integer totalStudents){
        this.totalStudents=totalStudents;
    }
    public void setStudentList(ArrayList<Student> studentList){
        this.studentList=studentList;
    }

    //getters
    public String getBlockCode(){
        return blockCode;
    }
    public String getDescription(){
        return description;
    }
    public String getAdviser(){
        return adviser;
    }
    public Integer getTotalStudents(){
        return totalStudents;
    }
    public ArrayList<Student> getStudentList(){
        return studentList;
    }

    public String toString(){
        String sectionOutput = new String();
        sectionOutput += "Block section code: " + blockCode + 
                             "\nDescription: " + description + 
                             "\nAdviser: " + adviser + 
                             "\n\nTotal Students: " + totalStudents + "\n\n";
        for(Student student: studentList){
            sectionOutput += student;
        }
        return sectionOutput;
    }
}
