public class Josephus_problem {


    /*
    Note: Every one sits in circular position
    Refer notes in pad for detailed explanation
     */
    public static void main(String[] args){

        int n = 5;
        int k = 3;
        int output = jos(n,k);
        System.out.println("winner is: " + output + " after killed every " + k +
                "position " +
                "and surrenders knife to next guy from there count starts, count starts from himself");

    }

    public static int jos(int n , int k){
        if (n == 1){
            return 0;
        }else{
            return (jos(n-1, k) + k) % n;
        }
    }
}
