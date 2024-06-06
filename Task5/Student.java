import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private ArrayList<Course> registeredCourses;
    public Student(String id, String name){
        this.id = id;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Course> getRegisteredCourses() {
        return registeredCourses;
    }
    public boolean registerCourse(Course course){
        if(course.enrolledStudents()){
            registeredCourses.add(course);
            return true;
        }
        return false;
    }
    public void dropCourse(Course course){
        if(registeredCourses.remove(course)){
            course.dropStudent();
        }
    }
    @Override
    public String toString(){
        return "Student ID: " + this.id + ", Student name: " + this.name;
    }
}