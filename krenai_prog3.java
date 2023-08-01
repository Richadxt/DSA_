public class krenai_prog3 {
      public static void main(String[] args){
          int n=6;
          fun2(n);
      }
      public static void fun2(int n){
          for(int i=1; i<=n;i++){
              for(int l=1;l<=i;l++){
                  System.out.print(" ");
              }
              for(int j=1;j<=(n-i+1);j++){
                  System.out.print("* ");
              }
             System.out.println();

          }
      }

}
