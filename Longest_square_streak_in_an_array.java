import java.util.HashSet;

public class Longest_square_streak_in_an_array {
    public static int fun(int[] nums){
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i:nums){
            hashSet.add(i);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count=1;
            while(hashSet.contains(num*num)){
                count++;
                num=num*num;
            }
            if(  count > 1 && count > max){
                max=count;
            }
        }

        return max==0 ? -1: max;
    }

    public static void main(String []args){
       int[] nums = {4,3,6,16,8,2};
       System.out.println(fun(nums));
    }
}
