import java.util.Scanner;
public class CharAtExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or linr: ");
        String name =scan.nextLine();
        char ch =name.charAt(4);
        System.out.println("the letter present in 4 is "+ch);
    }
}

//output
//   Enter a word or linr: poorvesh
//   the letter present in 4 is v