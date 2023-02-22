import java.util.*;
import java.lang.*;
import java.io.*;

public class Subarray_with_zero_sum {

        public static void main (String[] args)
        {
            int arr[] = new int[]{5, 3, 9, -4, -6, 7, -1};
            int n = arr.length;

            System.out.println(ZeroSumSubarray(arr, n));

        }

        static int ZeroSumSubarray(int arr[], int n)
        {
            HashSet<Integer> hashSet = new HashSet<>();
            int prefix_sum = 0;
            hashSet.add(0);
            for(int i = 0; i < n; i++)
            {
                prefix_sum += arr[i];
                if(hashSet.contains(prefix_sum))
                    return 1;

                hashSet.add(prefix_sum);
            }

            return 0;
        }
}
