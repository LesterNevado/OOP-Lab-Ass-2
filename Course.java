public class Course {
    private String courseCode;
    private String description;
    private Integer units;
    private String day;
    private String time;

    //setters
    public void setCourseCode(String courseCode){
        this.courseCode=courseCode;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setUnits(Integer units){
        this.units=units;
    }
    public void setDay(String day){
        this.day=day;
    }
    public void setTime(String time){
        this.time=time;
    }

    //getters
    public String getCourseCode(){
        return courseCode;
    }
    public String getDescription(){
        return description;
    }
    public Integer getUnits(){
        return units;
    }
    public String getDay(){
        return day;
    }
    public String getTime(){
        return time;
    }

    public String toString(){
        String courseOutput =  new String();
        courseOutput += courseCode + "\t" + description + "\t" +
                        units + "\t" + day + "\t" + time + "\n";
        return courseOutput;
    }
}
