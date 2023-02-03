import java.util.ArrayList;
public class EqualsExample {
    public static void main(String[] args) {
        String str1 = "poorvesh";
        ArrayList<String> list = new ArrayList<>();
        list.add("jenish");
        list.add("poorvesh");
        list.add("uttam");
        list.add("dharmik");
        for (String str : list) {
            if (str.equals(str1)) {
                System.out.println("poorvesh is present");
            }
        }
    }
}

//output
//poorvesh is present