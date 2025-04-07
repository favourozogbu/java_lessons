import java.util.Random;

public class MultiDArrayAlgo{
    public static void main (String[] args){
        int[][] multiArray = new int [3][6];
        populateArray(multiArray);
        printArray(multiArray);
        sortArray(multiArray);
        printArray(multiArray);
    }

    static void populateArray(int[][] arr){
        Random rand = new Random();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = rand.nextInt();
            }
        }
    } 

    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            System.err.println("Array "+i);
            for(int j=0; j<arr[i].length; j++){
                System.err.println("    Element "+arr[i][j]);
            }
        }
    } 

    static void sortArray(int[][] arr){
        for (int i =0; i<arr.length; i++){
            int n =arr[i].length; 
            for(int pass = 0; pass<n-1; pass++){
                for(int j=0;j<n-1-pass;j++){
                    if(arr[i][j]>arr[i][j+1]){
                        int tmp = arr[i][j];
                        arr[i][j] = arr[i][j+1];
                        arr[i][j+1] = tmp;
                    }
                }
            }
        }
    }

}