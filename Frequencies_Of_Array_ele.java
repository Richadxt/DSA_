import java.util.HashMap;
import java.util.Map;


public class Frequencies_Of_Array_ele {
    public static void fun2(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int x: arr){
            hashMap.put(x, hashMap.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: hashMap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
    public static void main(String[] args){
        int[] arr={50, 50, 10, 40, 40};
        fun2(arr);
    }
}
