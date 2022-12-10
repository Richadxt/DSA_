import java.util.HashSet;

public class Union_HashSet {
    public static void main(String[] args){
        int ar1[]=new int[]{15,17,27,27,28,15};
        int ar2[]=new int[]{16,27,15,17,98,28};
        int m= ar1.length;
        int n= ar2.length;
        System.out.println(Union(ar1,m,ar2,n));
    }

    private static int Union(int[] ar1, int m, int[] ar2, int n) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<m;i++) {
            hashSet.add(ar1[i]);
        }
        for(int i=0;i<n;i++){
                hashSet.add(ar2[i]);
        }
        return hashSet.size();
    }
}
