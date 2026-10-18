public class Permutations_of_String {

    /*
    Note: Check Notes in pad for detailed explanation
    output: Print all the combinations of given string
     */
    public static void main(String[] args) {
        String s = "ABC";
        permutations(s, 0);
    }

    public static void permutations(String s, int i) {
        if (i == s.length() - 1) {
            System.out.println(s);
            return;
        }
        for (int j = i; j < s.length(); j++) {
            s = swap(s, i, j);
            permutations(s, i + 1);
            // Backtrack
            s = swap(s, i, j);
        }
    }

    public static String swap(String s, int i, int j) {
        char[] chars = s.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}

