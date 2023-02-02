
import java.util.*;
public class cloud_Analogy2 {

    public static void fun1(int n){
        String s = Integer.toString(n);
        char[] a=new char[s.length()];
        ArrayList<Character> ar=new ArrayList<>();
        for (char c : a) {
            ar.add(c);
        }
        int i=0;
        while(i<=ar.size()){
            int n1=ar.get(i);
            ar.remove(i);
            Character[] array = ar.toArray(new Character[ar.size()]);
            String str=Arrays.toString(array);
            if (!isPalindrome(str, 0, str.length())) {
                System.out.println(n1);
            }
            i++;
        }

    }
    static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        fun1(n);
    }
}
