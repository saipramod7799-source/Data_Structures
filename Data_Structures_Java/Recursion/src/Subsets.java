public class Subsets {

    public static void main(String[] args){

        subsets("ABCD" , "", 0);
    }

    public static void subsets(String str, String curr, int i){

        if (i == str.length()){
            System.out.println(curr);
            return;
        }

        subsets(str, curr, i+1);
        subsets(str, curr + str.charAt(i), i+1);
    }
}
