import java.util.Scanner;

public class StringTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(s1+"Gediya");
        System.out.println(s1.trim()+"Gediya");
    }
}

// output
// my name is poorvesh
// my name is poorvesh Gediya
// my name is poorveshGediya
