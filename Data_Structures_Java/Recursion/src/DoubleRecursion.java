public class DoubleRecursion {
    public static void main(String args[]){
        int n = 3;
//        recursion(n);
        recursion1(n);

    }

    public static void recursion(int n) {
        if(n>0){
            System.out.println("i am coming " + n + " time");
            recursion(n-1);
            recursion(n-1);
        }
    }

    public static void recursion1(int n) {
        if(n>0){
            recursion(n-1);
            recursion(n-1);
            System.out.println("i am coming " + n + " time");

        }
    }

    public static void recursion2(int n) {
        if(n>0){
            System.out.println("i am coming " + n + " time");
            recursion(n-1);
            recursion(n-1);
        }
    }
}
