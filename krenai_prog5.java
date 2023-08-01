public class krenai_prog5 {

        public static void main(String[] args) {
            String str = "Hello World 123";
            System.out.println("Converted String: " + fun5(str));

        }

        public static String fun5(String str) {
            StringBuilder result = new StringBuilder();

            for (char ch : str.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    result.append(Character.toLowerCase(ch));
                } else if (Character.isLowerCase(ch)) {
                    result.append(Character.toUpperCase(ch));
                } else {
                    result.append(ch);
                }
            }

            return result.toString();
        }
}
