import java.util.Stack;

public class Stock_Span_Ele {

    public static void printSpan(int[] arr, int n){
        Stack<Integer> s=new Stack<>();
        s.add(0);
        System.out.print(1 + " ");
        for(int i=1; i<n;i++){
            while(s.isEmpty() == false && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            int span = s.isEmpty() ? i+1 : i-s.peek();
            System.out.print(span + " ");
            s.push(i);
        }
    }
    public static void main(String[] args){
        int[] arr=new int[]{13, 15, 12, 14, 16, 8, 6, 4, 10, 30};
        printSpan(arr, arr.length);
    }
}
