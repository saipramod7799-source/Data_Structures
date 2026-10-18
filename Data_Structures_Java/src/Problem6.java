public class Problem6 {

    public static void main(String[] args) {

        String input = "KMaharashtraP411066IIndiaTPune";
        String k = input.substring(0, 1);
        String state = input.substring(1, 12);
        String p = input.substring(12, 13);
        String pincode = input.substring(13, 19);
        String i = input.substring(19, 20);
        String country = input.substring(20, 25);
        String t = input.substring(25, 26);
        String city = input.substring(26);
        String result = k + p + i + t + " " + city + " " + pincode + " " + state + " " + country;
        System.out.println("Expected Output string : " + result);
    }
}
