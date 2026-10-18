import java.util.Scanner;

public class Fibinocci {

    static int no = 2, n1 = 0, n2 = 1, n3 = 0;

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of Fibinocci numbers you want: ");
        int n = s.nextInt();
        System.out.println(n1);
        System.out.println(n2);
       // Fibinocci(n1, n2, n, no);
        Fibinocci1(n-2);

    }

//    Approach 1
//    public static void Fibinocci(int n1, int n2, int n, int no){
//        if(no != n){
//            int n3 = (n1+n2);
//            System.out.println(n3);
//            no++;
//            n1 = n2;
//            n2 = n3;
//            Fibinocci(n1, n2, n, no);
//        }
//    }

//    Approach 2
    public static void Fibinocci1(int count){
        if(count > 0){
            n3 = n1+n2;
            System.out.println(n3);
            n1 = n2;
            n2  = n3;
            Fibinocci1(count-1);
        }
    }
}
