import java.util.HashSet;

public class Pair_sum_unordered_array {
    public static boolean fun(int[] arr, int sum){
        HashSet<Integer> hashSet=new HashSet<>();
        for (int j : arr) {
            if (hashSet.contains(sum - j))
                return true;
            hashSet.add(j);
        }
        return false;
    }
    public static void main(String[] args){
        int[] ar1 =new int[]{15,17,27,27,28,5};
        int sum= 20;
        System.out.println(fun (ar1, sum));
    }
}
