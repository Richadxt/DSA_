import java.util.Stack;

public class Previous_Greater_ele {
    public static void fun(int[] arr, int n){
        Stack<Integer> s=new Stack<>();
        s.push(arr[0]);
        System.out.print(-1 + " ");
        for(int i=1;i<n;i++) {
            while (s.isEmpty() == false && s.peek() <= arr[i]) {
                s.pop();
            }
            int PG = s.isEmpty() ? -1 : s.peek();
            System.out.print(PG + " ");
            s.push(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{20, 30, 10, 5, 15};
        fun(arr, arr.length);
    }
}
