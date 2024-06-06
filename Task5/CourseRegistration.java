import java.util.ArrayList;

public class CourseRegistration {
    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    public CourseRegistration(){
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    public void addCourse(Course course){
        courses.add(course);
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void listCourses(){
        for (Course course : courses) {
            System.out.println(course);
            System.out.println("Available slots: " + course.getAvailableSlots());
        }
    }
    public Course findCourseByCode(String code){
        for (Course course : courses) {
            if(course.getCode().equals(code)){
                return course;
            }
        }
        return null;
    }
    public Student findStudentByID(String id){
        for (Student student : students) {
            if(student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }
    public void registerStudentForCourse(String studentID, String courseCode){
        Student student = findStudentByID(studentID);
        Course course = findCourseByCode(courseCode);
        if(student == null && course == null){
            System.out.println("Course is full.");
        }else{
            if(student.registerCourse(course)){
                System.out.println("Registration successful.");
            }else{
                System.out.println("Course is full.");
            }
        }
    }
    public void dropCourseForStudent(String studentID, String courseCode){
        Student student = findStudentByID(studentID);
        Course course = findCourseByCode(courseCode);
        if(student == null && course == null){
            System.out.println("Invalid id or code.");
        }else{
            student.dropCourse(course);
            System.out.println("Course is dropped successfully");
        }
    }
}