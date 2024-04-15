import java.util.*;
public class AccountSetup {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a username:");
        String username = input.next();
        System.out.println("Enter a at least 8 character password:");
        String password = input.next();
        int length = password.length();
        while(length<7){
            System.out.println("Enter a at least 8 character password:");
            password = input.next();
            length = password.length();
        }
        password = password.toLowerCase();
        username = username.toLowerCase();
        System.out.println("Your usermname is " + username + " Your password is " + password);
    }
}
