public class Course {
    private String code;
    private String title;
    private String description;
    private int capacity;
    private int enrolledStudents;
    private String schedule;

    public Course(String code,String title, String description, int capacity, int enrolledStudents, String schedule){
        this.capacity = capacity;
        this.code = code;
        this.description = description;
        this.enrolledStudents = enrolledStudents;
        this.schedule = schedule;
        this.title = title;
    }
    public String getCode() {
        return code;
    } public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public int getCapacity() {
        return capacity;
    }
    public String getSchedule() {
        return schedule;
    }
    public int getAvailableSlots(){
        return capacity - enrolledStudents;
    }
    public boolean enrolledStudents(){
        if(enrolledStudents<capacity){
            enrolledStudents++;
            return true;
        }
        return false;
    }
    public void dropStudent(){
        if(enrolledStudents > 0){
            enrolledStudents--;
            
        }
    }
}
