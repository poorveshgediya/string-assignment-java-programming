import java.util.Scanner;

public class Replace {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String replaceString=s1.replace('a','e');
        System.out.println(replaceString);
    }
}

//output
// jeve