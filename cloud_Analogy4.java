public class cloud_Analogy4 {

    public static void fun(int n){

        for(int i=1;i<n+1;i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print((char) (64 + j));
            }
            for (int k = 2; k < (2 * i - 1); k++) {
                System.out.print(" ");
            }
            if(i==1){
                for (int l = n - 1; l > 0; l--) {
                    System.out.print((char) (64 + l));
                }
            }
            if (i > 1) {
                for (int l = n - i + 1; l > 0; l--) {
                    System.out.print((char) (64 + l));
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        int n=6;
        fun(n);
    }
}
