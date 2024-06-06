import java.util.Scanner;
public class Task1{
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.println("You have to guess a number between 1 and 100.");
        System.out.println("Let's Start our number game: ");
        int attempts = 6;
        int score = 0;
        while(true){
            int random = (int)(Math.random()*100)+1;
            for (int i = attempts; i > 0; i--) {
                System.out.println(i+ " attempts left,continue: ");
                int userguess = inn.nextInt();

                if(userguess == random){
                    System.out.println("Fabulous! you found it.");
                    score += i;
                }else if(userguess < random){
                    System.out.println("your expectations are low. Try a higher number");
                }else if(userguess > random){
                    System.out.println("your expectations are high. Try a smaller number");
                }
                
                if(i == 1){
                    System.out.println("No attempts left, the number was " + random);
                }
            }  
            System.out.println("Total score: " + score);
            System.out.println("Do you want to play more?"); 
            String response = inn.next();
            
            if(response.equalsIgnoreCase("no"))
            break;   
        }
        System.out.println("Thank you dear.");
    }
}