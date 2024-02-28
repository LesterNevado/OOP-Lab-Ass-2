import java.util.*;
import java.io.*;
public class CourseDA {
    private ArrayList<Course> courseList;
    private Integer totalUnitsEnrolled;

    public CourseDA(String studentNo) throws FileNotFoundException{
        Scanner courseInput = new Scanner(new FileReader("scheduleInfo.csv"));
        courseList = new ArrayList<>();
        totalUnitsEnrolled = 0;

        while(courseInput.hasNext()){
            String courseRow = new String();
            courseRow = courseInput.nextLine();
            String[] courseRowSpecific = new String[6];
            courseRowSpecific = courseRow.split(",");

            if(studentNo.equals(courseRowSpecific[0])){
                Course course = new Course();
                course.setCourseCode(courseRowSpecific[1].trim());
                course.setDescription(courseRowSpecific[2]);
                course.setUnits(Integer.parseInt(courseRowSpecific[3].trim()));
                totalUnitsEnrolled += (Integer.parseInt(courseRowSpecific[3]));
                course.setDay(courseRowSpecific[4].trim());
                course.setTime(courseRowSpecific[5].trim());

                courseList.add(course);
            }

        }
        courseInput.close();
    }
    public ArrayList<Course> getCourseList(){
        return courseList;
    }
    public Integer getTotalUnitsEnrolled(){
        return totalUnitsEnrolled;
    }
}
