public class WhileTest {
    public static void main(String[] args) {
        int counter = 0;      
        while(counter < 10){
            counter+=2;
            System.out.println("Counter = "+counter);
        }
        System.out.println("");

        for (int i = 0; i <= 10; i++) {
            if(i%2==0 && i !=0){
                System.out.println("Counter = "+i);
            }
            
        }
        System.out.println("");
        
    }
}
