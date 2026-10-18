public class ForwardRecursion {

    public static void main(String args[]){
        int n = 3;
        recursion(n);
    }

    public static void recursion(int n) {
        if(n>0){
            System.out.println("i am coming " + n + " time");
            recursion(n-1);
        }
    }
}


