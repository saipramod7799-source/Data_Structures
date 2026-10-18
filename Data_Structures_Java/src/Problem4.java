public class Problem4 {

    public static void main(String[] args) {
        /*
         * Input Array {A,11,B,22,33,C,44}
         * Find numbers, whose combination gives rise to sum of 55
         * Expected Output : 11,44, 22,33
         */
        String[] input = { "A", "11", "B", "22", "33", "C", "44" };
        int targetSum = 55;

        int[] numbers = new int[input.length];
        int count = 0;

        for (String s : input) {
            if (isNumeric(s)) {
                numbers[count++] = Integer.parseInt(s);
            }
        }

        System.out.println("Expected Output :");
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.println(numbers[i] + "," + numbers[j]);
                }
            }
        }
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty())
            return false;
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
}
