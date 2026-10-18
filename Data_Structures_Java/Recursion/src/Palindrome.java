public class Palindrome {

    public static void main(String[] args){

        String input = "aabbba";
        int start = 0;
        int end = input.length()-1;
        boolean output = ispalindrome(input, start, end);
        if (output){
            System.out.println("String " + input + " is Palindrome");
        }else{
            System.out.println("String " + input + " is not a Palindrome");
        }


    }

    public static boolean ispalindrome(String str, int start, int end){
        if (start>=end) {
            return true;
        }
        return (str.charAt(start) == str.charAt(end) && ispalindrome(str, start+1, end-1));
    }
}
