import java.util.Scanner;

public class StartWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(s1.startsWith("ja"));
        System.out.println(s1.startsWith("java string"));
        System.out.println(s1.startsWith("Java string"));
    }
}
//output
// this is ja
// false
// false
// false