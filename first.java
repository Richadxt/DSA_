import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class first {
    private static final int MAX_BEAUTY = 26;
    private static Map<Integer, List<Integer>> graph;
    private static int[] beautyArr;
    private static int[] countArr;
    private static boolean[] visited;
    private static int maxBeauty;

    public static int beauty(int n, int m, String S, int[] X, int[] Y) {
        graph = new HashMap<>();
        beautyArr = new int[S.length()];
        countArr = new int[MAX_BEAUTY];
        visited = new boolean[S.length()];

        for (int i = 0; i < S.length(); i++) {
            beautyArr[i] = S.charAt(i) - 'a' + 1;
        }

        for (int i = 0; i < m; i++) {
            int x = X[i] - 1;
            int y = Y[i] - 1;
            if (!graph.containsKey(x)) {
                graph.put(x, new ArrayList<>());
            }
            graph.get(x).add(y);
        }

        for (int i = 0; i < S.length(); i++) {
            if (!visited[i]) {
                maxBeauty = Math.max(maxBeauty, dfs(i));
            }
        }

        return maxBeauty > 1000 ? -1 : maxBeauty;
    }

    private static int dfs(int node) {
        int beauty = beautyArr[node];
        countArr[beauty - 1]++;
        visited[node] = true;

        int maxCount = countArr[beauty - 1];
        if (graph.containsKey(node)) {
            for (int nextNode : graph.get(node)) {
                if (!visited[nextNode]) {
                    maxCount = Math.max(maxCount, dfs(nextNode));
                }
            }
        }
        countArr[beauty - 1] = 0;
        return maxCount;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        System.out.println("Enter value of m: ");
        int m=sc.nextInt();
        System.out.println("Enter String S: ");
        String S=sc.next();
        System.out.println("Write element of first list: ");
        int[] X=new int[m];
        for(int i=0;i<m;i++){
            X[i]=sc.nextInt();
        }
        System.out.println("Write element of second list: ");
        int[] Y=new int[m];
        for(int j=0;j<m;j++){
            Y[j]=sc.nextInt();
        }
        System.out.println("The beauty of most beautiful path is: " + beauty(n,m,S,X,Y));

    }

}
