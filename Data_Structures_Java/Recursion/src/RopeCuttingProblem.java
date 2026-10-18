public class RopeCuttingProblem {

    /*
    Input = rope length, a,b,c
    output = Max number of pieces we can cut the rope of length such that each piece should be length of either of a or b or c
     */
    public static void main(String[] args){

        int count = maxpieces(5, 2, 5, 1);
        System.out.println("Number of pieces of rope is: " + count);
    }

    public static int maxpieces(int rope, int a, int b, int c){

        if (rope == 0){
            return 0;
        }
        if(rope < 0){
            return -1;
        }

        int cutA = maxpieces(rope-a, a, b, c);
        int cutB = maxpieces(rope-b, a, b, c);
        int cutC = maxpieces(rope-c, a, b, c);

        int result = Math.max(cutA, Math.max(cutB, cutC));
        if (result == -1){
            return -1;
        }
        return result + 1;
    }
}
