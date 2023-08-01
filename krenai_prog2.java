public class krenai_prog2 {
    public static void main(String[] args){
        int n=6;
        fun1(n);
    }
    public static void fun1(int n){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
            for(int p=1;p<=(n-2);p++ ) {
                for (int k = 1; k <= n; k++) {
                    if (k == 1 || k == 6) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }

    }
}
