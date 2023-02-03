import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();        char[] ch = s1.toCharArray();
        int len = ch.length;
        System.out.println("Char Array length: " + len);
        System.out.println("Char Array elements: ");
        for (int i = 0; i < len; i++) {
            System.out.println(ch[i]);
        }
    }
}

// output
// my name is poorvesh gediya
// Char Array length: 26
// Char Array elements:
// m
// y

// n
// a
// m
// e

// i
// s

// p
// o
// o
// r
// v
// e
// s
// h

// g
// e
// d
// i
// y
// a
