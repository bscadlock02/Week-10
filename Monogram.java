import java.util.*;
public class Monogram {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first = input.next();
        System.out.println("Enter your middle intial:");
        String middle = input.next();
        System.out.println("Enter your last name:");
        String last = input.next();
        first = first.substring(0,1);
        last = last.substring(0,1);
        first = first.toLowerCase();
        middle = middle.toLowerCase();
        last = last.toUpperCase();
        System.out.println("Your monogram is: " + first + last + middle );
    input.close();
}
}