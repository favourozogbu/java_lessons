import java.util.Random;

public class DeepArrayBasics2{
    public static void main(String[] args){
        int[][] array = new int[2][22];
        //populate
        for (int i = 0; i < array.length; i++) {
            int k =0;
            for (int j = 0; j < array[i].length; j++) {
                Random rand = new Random();
                array[i][j] = rand.nextInt();
                k++;
            }
        }
        printArray(array);//print
        add1(array);//add1
        printArray(array);//print
        evenAndDivBy11(array);
    }
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Outer" + i);
            for(int j=0; j<array[i].length; j++){
                System.out.println("    Inner" + array[i][j]);
            }
        }
    }

    public static void add1(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for(int j=0; j<array[i].length; j++){
                array[i][j]+=1;
            }
        }
    }

    public static void evenAndDivBy11(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Outer" + i);
            for(int j=0; j<array[i].length; j++){
                if (array[i][j]%11==0 && array[i][j]%2==0) {
                    System.out.println("    Inner" + array[i][j]);
                }
                
            }
        }
    }
}