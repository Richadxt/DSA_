import java.util.Scanner;

public class Neretrstring {
    // Java program to reverse a string
// s = input()
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            String ar[] = str.split(" ");
            String ans = "";
            for (int i = ar.length - 1; i >= 0; i--) {
                ans += ar[i] + " ";
            }
            System.out.println(ans.substring(0, ans.length() - 1));
        }
    }

