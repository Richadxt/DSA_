
import java.util.*;
import java.util.regex.Pattern;

public class ca5 {

    public static void fun(String str){
        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(str);
        String result = "";

        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        result=result+ " ";
        int start=0;
        for(int i=0;i<result.length();i++){
            char c=result.charAt(i);
            if(c==' '){
                String word = result.substring(start,i);
                System.out.print(word + word.length() + " ");
                start=i+1;
            }
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentece:");
        String str=sc.nextLine();
        fun(str);
    }
}
