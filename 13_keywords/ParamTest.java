public class ParamTest {
    public static void main(String[] args) {
        String str1 = "Helloo";
        String str2 = "world";
        String str3 = "!";

        int no1 = 6;
        int no2 = 3;
        int no3 = 10;        
        
        concatenateAndPrint(str1, str2, str3);
        addAndPrint(no1, no2);
        subAndPrint(no1, no2);
        divAndPrint(no1, no2);
        System.out.println(returnBiggestNumber(no1, no2, no3));
        System.out.println(returnLongest(str1, str2, str3));
    }
    
    public static void concatenateAndPrint(String str1, String str2, String str3) {
        String concatenatedString = str1 + " " + str2 + str3;
        System.out.println("Concatenated String: " + concatenatedString);
    }

    public static void addAndPrint(int no1, int no2) {
        int no3 = no1 + no2;
        System.out.println(no1 + " plus " +no2+" = " + no3);
    }

    public static void subAndPrint(int no1, int no2) {
        int no3 = no1 - no2;
        System.out.println(no1 + " minus " +no2+" =" + no3);
    }

    public static void divAndPrint(int no1, int no2) {
        int no3 = no1 / no2;
        System.out.println(no1 + " divided by " +no2+" =" + no3);
    }

    public static int returnBiggestNumber(int no1, int no2, int no3) {
        if(no1>=no2 && no1>=no3){
            return no1;
        }
        if(no2>=no1 && no2>=no3){
            return no1;
        }
        else
            return no3;
    }

    public static String returnLongest(String str1, String str2, String str3) {
        if(str1.length()>=str2.length() && str1.length()>=str3.length()){
            return str1;
        }
        if(str2.length()>=str1.length() && str2.length()>=str3.length()){
            return str2;
        }
        else
            return str3;
    }
}
