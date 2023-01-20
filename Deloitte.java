import java.util.Scanner;

public class Deloitte {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] str = {"7868542567A4054", "7868542567H8054", "7868542567F6054", "7868542567L6954"};
        fun(str);
    }
    public static void fun(String str[]) {
        int count=0;
        String s=" ";
        for(int i=0;i<str.length;i++) {
            s = str[i];
            char[] a = s.toCharArray();
            if (a[11] >= '6' || a[11] >= '7' || a[11] >= '8' || a[11] >= '9') {
                count++;
            }
        }
        System.out.println(count);
    }
}

