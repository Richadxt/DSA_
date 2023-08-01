import java.util.*;

public class krenai_prog7 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a=sc.next();
        System.out.println("Enter b String: ");
        String b=sc.next();
        System.out.println("c" + " = " + fun7(a, b));
    }
    public static String fun7(String a, String b){
            if (a.equals(b)) {
                return "";
            } else {
                return "Any non-empty string";
            }
    }

}
