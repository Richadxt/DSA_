import java.util.*;

public class interview1cloud {

    public static int fun(String str){
        String[] ar=str.split(" ");
        return ar.length;
    }

    public static void main(String[] args){
        String str="Richa Dixit";
        System.out.println(fun(str));
    }

}
