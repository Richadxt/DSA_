import java.util.HashSet;
import java.util.*;

// Find duplicate number in an array
public class haansa2 {
        public static void findDuplicate(int[] nums) {

                    Set<Integer> hs = new HashSet<Integer>();
                    for (int num : nums) {
                        if (hs.contains(num))
                            System.out.println(num);
                        hs.add(num);
                    }

//            HashSet<Integer> hs= new HashSet<>();
//            int count=0;
//            for(int i=0;i<nums.length;i++){
//                for(int j=i+1;j<nums.length;j++){
//                    if(nums[i]==nums[j]){
//                        count++;
//                    }
//                }
//                if(count > 0) {
//                    hs.add(nums[i]);
//                    count=0;
//                }
//            }
//            Iterator<Integer> e= hs.iterator();
//            while(e.hasNext())
//            {
//                System.out.println(e.next());
//            }
        }
    public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int[] ar=new int[n];
            for(int i=0;i<n;i++){
                ar[i]=sc.nextInt();
            }
            findDuplicate(ar);
    }

}
