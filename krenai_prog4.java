public class krenai_prog4 {
    public static void main(String[] args) {
        int count=1;
        for (int n = 0; n <= 1000; n++) {

            if (fun4(n) == true) {
                System.out.println(n);
                count++;
            }
            if(count==50) break;
        }
        System.out.println(count);
    }
    public static Boolean fun4(int n){
        if (n == 1) return false;
        if (n == 2 || n == 3) {
            return true;
            //  System.out.print(n + " " );
        }
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
}
