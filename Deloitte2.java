import java.util.Scanner;

public class Deloitte2 {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       System.out.println(fun(n));
    }
    public static int fun(int n) {

        Deloitte2  obj = new Deloitte2();
        int c = obj.countDig(n);
        int rev=0;
        int d=1;
        while(d!=c) {
                int count = 0;
                for(int i=0;i<d;i++){
                    count = n % 10;
                    n = n / 10;
                }
                while (n != 0) {
                int remainder = n % 10;
                rev = rev * 10 + remainder;
                n = n / 10;
                }
                d++;
        }
      return n;
    }

    public int countDig(int n)
    {
        String str = Integer.toString(n);
        int size = str.length();
        return size;
    }
}
