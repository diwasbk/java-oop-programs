import java.util.Scanner;

class InvalidEmailException extends Exception{

    public InvalidEmailException(String message){
        super(message);
    }
}

public class GmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        try{
            if(email.endsWith("@gmail.com")){
                System.out.println("Your email: " + email);
            }else{
                throw new InvalidEmailException("Invalid email address.");
            }
        }catch(InvalidEmailException e){
            System.out.println(e);
        }finally{
            sc.close();
        }

    }
}