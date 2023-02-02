import java.util.Scanner;

public class cloud_Analogy3 {
    public static void fun(int k){
        int[] ar=new int[k];
        ar[k-1]=k;
        ar[k-2]=2;
        for(int i=k-3;i>=0;i--){
            ar[i]=1;
        }
        int sum=0,mul=1;
        for(int i=0;i< ar.length;i++){
            sum+=ar[i];
            mul*=ar[i];
        }
        if(mul>=sum){
            for(int i=0;i< ar.length;i++){
                System.out.println(ar[i]);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        fun(k);
    }

}
