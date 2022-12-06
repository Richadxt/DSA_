import java.util.HashSet;

public class Count_Distinct_Element {
    public static int fun1(int[] arr){
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hash.add(arr[i]);
        }
        return hash.size();
    }
    public static void main(String[] args){
        int arr[]={10,11,12};
          System.out.println(fun1(arr));
    }
}
