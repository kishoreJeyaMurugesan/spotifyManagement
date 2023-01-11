
import java.util.Scanner;

class VoterIDException extends Exception {
   
    public VoterIDException(final int age) {
        System.out.println("your age is: " + age);
    }
    
    public void checkAge(final int age) {
    
        if (age < 18) {
        
            try {
                throw new VoterIDException();
            } catch (VoterIDException exception) {
                System.out.println("you are not eligible for vote " + exception);
            }
        } else {
            System.out.println("you are eligible for vote");
        }
    }
}

class VoterID {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int age = scanner.nextInt();
        
         final VoterIDException voterIdException = new VoterIDException(age);
        voterIDException.checkAge();
    }
}        
                                
