public class Problem2 {

    public static void main(String args[]){
        //Input string array -> Hello1234olleH4321
        // Expected Output -> Character strings are Hello , olleH
        //                    Character string is palindrome
        //                    Number strings are 1234, 4321
        //                    Number string is palindrome
        String input = "Hello1234olleH4321";
        
        StringBuilder strings = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                strings.append(c);
            } else if (Character.isDigit(c)) {
                numbers.append(c);
            }
        }

        String stringCheck = strings.toString();
        String numStr = numbers.toString();

        String char1 = stringCheck.substring(0, stringCheck.length() / 2);
        String char2 = stringCheck.substring(stringCheck.length() / 2);
        
        String num1 = numStr.substring(0, numStr.length() / 2);
        String num2 = numStr.substring(numStr.length() / 2);

        System.out.println("Character strings are " + char1 + " , " + char2);
        if (isPalindrome(stringCheck)) {
            System.out.println("Character string is palindrome");
        }

        System.out.println("Number strings are " + num1 + ", " + num2);
        if (isPalindrome(numStr)) {
            System.out.println("Number string is palindrome");
        }

    }

    public static boolean isPalindrome(String str) {
        String lower = str.toLowerCase();
        int start = 0;
        int end = lower.length() - 1;
        
        while (start < end) {
            if (lower.charAt(start) != lower.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
