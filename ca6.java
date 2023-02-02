import java.util.*;

public class ca6 {

    public static void fun(int n1, int n2){
        int carry=0;
        int count_carry=0;

        while(n1>0 && n2>0) {
            int a = n1 % 10;
            int b = n2 % 10;
            int sum = a + b + carry;
            if (sum >= 10) {
                carry = 1;
                count_carry++;
            } else {
                carry = 0;
            }
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        System.out.println(count_carry);
    }

    public static void main(String[] args){
        int n1=675;
        int n2=126;
        fun(n1,n2);
    }
}
