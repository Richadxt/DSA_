public class QSS {
    public static void fun(int num){
        if(num%3==0 && num%5!=0){
            System.out.println("Richa");
        }
        else if(num%5==0 && num%3!=0){
            System.out.println("Dixit");
        }
        else if(num%3==0 && num%5 ==0){
            System.out.println("Richa Dixit");
        }
        else{
            System.out.println(num);
        }
    }
    public static void main(String args[]){
        int n=47;
        fun(n);
    }
}
