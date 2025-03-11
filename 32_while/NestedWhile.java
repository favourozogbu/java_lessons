public class NestedWhile {
    public static void main(String[] args) {  
        // for(int i = 0;i<5;i++){
        //     System.out.println("Outer = "+i);
        //     for(int i = 0;i<5;i++){
        //         System.out.println(" Inner = "+j);
        //     }           
        // }
        int i=0;
        while(i<5){
            System.out.println("Outer = "+i);
            int j=0;
            while(j<5){
                System.out.println(" Inner = "+j);
                j++;
            }
            i++;
        }
    }
}
