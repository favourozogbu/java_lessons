public class BreakTest2 {
    public static void main(String[] args) {    
        int i = 0;
        
        outer: while (i < 3) {
            System.out.println("outer:" + i);
            int j = 0;
            
            inner: while (j < 3) {
                System.out.println(" inner:" + j);
                
                if (i == 2) {
                    break inner; 
                }
                
                int k = 0;
                
                innest: while (k < 3) {
                    System.out.println("  innest:" + k);
                    k++;
                }
                
                j++;
            }
            
            i++;
        }

        // outer:for(int i = 0;i<3;i++){
        //     System.out.println("outer:"+i);
        //     inner:for(int j = 0;j<3;j++){
        //         System.out.println(" inner:"+j);
        //         if(i == 2){
        //          break inner;
        //         }
        //         innest:for(int k = 0;k<3;k++){
        //             System.out.println("  innest:"+k);
        //         }            	
        //     }        	
        // }

    }
}
