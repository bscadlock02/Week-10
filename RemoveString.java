import java.util.*;
public class RemoveString {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentance = input.nextLine();
        System.out.println("Enter a string:");
        String word = input.nextLine();
        String newsentance = sentance.replace("" + word,"");
        System.out.println(newsentance);
        input.close();
}
}