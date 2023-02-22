
public class hansa6 {
    // Java program to print largest contiguous array sum

        public static void main(String[] args)
        {
            int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
            System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
        }

        // Function Call
        static int maxSubArraySum(int a[])
        {
                int maximum_sum = 0;
                int current_sum = 0;
                for(int i=0; i< a.length; i++)
                {
                    current_sum= current_sum + a[i];
                    if(current_sum>maximum_sum)
                    {
                        maximum_sum = current_sum;
                    }
                    if(current_sum < 0)
                    {
                        current_sum = 0;
                    }
                }
                return maximum_sum;

        }
}
