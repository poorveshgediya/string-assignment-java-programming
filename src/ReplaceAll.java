import java.util.Scanner;

public class ReplaceAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String replaceString = s1.replaceAll("a", "e");
        System.out.println(replaceString);
    }
}

//output
//geeksforgeeks is better then jevetpoint
