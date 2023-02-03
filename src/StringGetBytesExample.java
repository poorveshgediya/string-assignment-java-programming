public class StringGetBytesExample {
    public static void main(String[] args) {
        String s1 = "poorvesh";
        byte[] barr = s1.getBytes();
        for (int i = 0; i < barr.length; i++) {
            System.out.println(barr[i]);

        }
    }
}

//output
// 112
// 111
// 111
// 114
// 118
// 101
// 115
// 104