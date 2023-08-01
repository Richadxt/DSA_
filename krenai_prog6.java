public class krenai_prog6 {
    public static void main(String[] args){
        int[] arr={2, 4, 5, 1, 3};
        fun6(arr);
    }
    public static void fun6(int[] arr){
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-2]);
            int high1 = Integer.MIN_VALUE;
            int high2 = Integer.MIN_VALUE;
            for (int ar : arr) {
                if (ar > high1) {
                    high2 = high1;
                    high1 = ar;
                } else if (ar > high2) {
                    high2 = ar;
                }
            }
            System.out.println(high2);
    }

}
