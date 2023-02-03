import java.util.ArrayList;

public class EqualsIgnoreCaseExample {
    public static void main(String[] args) {
        String str1 = "Poorvesh Gediya";
        ArrayList<String> list = new ArrayList<>();
        list.add("Mohan");
        list.add("Mukesh");
        list.add("RAVI");
        list.add("Poorvesh Gediya");
        list.add("Suresh");
        for (String str : list) {
            if (str.equalsIgnoreCase(str1)) {
                System.out.println("Poorvesh Gediya is present");
            }
        }
    }
}

//output
//Poorvesh Gediya is present