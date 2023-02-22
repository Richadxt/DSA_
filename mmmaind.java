import java.util.*;
public class mmmaind {

        public static String updateString(String s) {
            char[] arr = s.toCharArray();
            int n = arr.length;
            char[] new_arr = new char[n];
            for (int i = 0; i < n; i++) {
                char c = arr[i];
                int count_plus = 0, count_minus = 0;
                if (i > 0) {
                    if (arr[i-1] == '+') count_plus++;
                    else if (arr[i-1] == '-') count_minus++;
                }
                if (i < n-1) {
                    if (arr[i+1] == '+') count_plus++;
                    else if (arr[i+1] == '-') count_minus++;
                }
                if (c == '0') {
                    if (count_plus == 1 && count_minus == 0) new_arr[i] = '+';
                    else if (count_plus == 0 && count_minus == 1) new_arr[i] = '-';
                    else if (count_plus == 1 && count_minus == 1) new_arr[i] = '0';
                    else new_arr[i] = '0';
                } else {
                    new_arr[i] = c;
                }
            }
            return new String(new_arr);
        }

        // Main function to solve the problem
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int t = 1; t <= T; t++) {
                int n = sc.nextInt();
                String s = sc.next();
                String new_s = s;
                while (true) {
                    String old_s = new_s;
                    new_s = updateString(old_s);
                    if (new_s.equals(old_s)) break;
                }
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (new_s.charAt(i) == '0') count++;
                }
                System.out.println(count);
            }
            sc.close();
        }
    }
