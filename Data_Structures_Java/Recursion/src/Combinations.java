public class Combinations {

    static int combination(int n, int r){
        return ((fact(n) / (fact(r) * fact(n-r))));
    }
    static int fact(int n){
        int result = 1;
        for(int i = 2; i<=n; i++){
            result = i*result;
        }
        return result;
    }

    public static void main(String args[]){

        int n = 5;
        int r = 3;
        System.out.println(combination(n, r));
    }
}
