import java.util.*;

public class hansa3 {

        public static int longestConsecutive(int[] nums) {
            Set<Integer> hs = new HashSet<Integer>();
            for (int num : nums) {
                hs.add(num);
            }

            int longestStreak = 0;

            for (int num : hs) {
                if (!hs.contains(num-1)) {
                    int currentNum = num;
                    int currentStreak = 1;

                    while (hs.contains(currentNum+1)) {
                        currentNum += 1;
                        currentStreak += 1;

                    }


                    longestStreak = Math.max(longestStreak, currentStreak);
                }
            }

            return longestStreak;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] ar=new int[n];
            for(int i=0;i<n;i++){
                ar[i]=sc.nextInt();
            }
            System.out.println("longest streak is:" + longestConsecutive(ar));
        }
    }

