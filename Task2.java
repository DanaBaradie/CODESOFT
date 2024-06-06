import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       Scanner inn = new Scanner(System.in);
       System.out.print("Place the number of subjects:  ");
       int numOfSubjects = inn.nextInt();
       double[] grades = new double[numOfSubjects];
       double sum = 0;
       System.out.println("Enter the grades of each subject out of 100: ");
       for (int i = 0; i < grades.length; i++) {
        double grade = inn.nextDouble();
        if(grade < 0 || grade > 100){
            System.out.println("Unavailable number, Enter a valid number");
            i--;
        }else{
            grades[i] = grade;
            sum += grade;
        }
       }
       double average = sum / numOfSubjects;
       System.out.println("Total sum of grades: " + sum);
       System.out.println("Average percentage: "+average);
       System.out.println(assignGrades(average));


    }
    public static char assignGrades(double average){
        if(average >= 90){
            return 'A';
        }else if(average >= 80){
            return 'B';
        }
        else if(average >= 70){
            return 'C';
        }
        else if(average >= 60){
            return 'D';
        }else{
            return 'F';
        }
    }
}