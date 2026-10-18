public class Sum_of_Digits {

    public static void main(String[] args){

        int input = 9985;
        int count = 0;
        int output = countofdigits(input, count);
        System.out.println("Sum of digits is: " + output);

    }

    public static int countofdigits(int input, int count){

        if (input == 0){
            return count;
        }else{
            count += input%10;
            input = input/10;
            return countofdigits(input, count);
        }
    }
}
