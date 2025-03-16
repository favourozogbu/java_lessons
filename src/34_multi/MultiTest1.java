public class MultiTest1 {
    public static void main(String[] args) {
    	
        int [][] lottogroups = {{1111,2222,3333,4444},{6666,7777,8888,9999},{11111,121212,131313}};
    	
        // for(int i = 0;i < lottogroups.length ;i++){
        //     System.out.println("Group :"+i);
        //     for(int j = 0;j < lottogroups[i].length ;j++){
        //         if(lottogroups[i][j]%2==0){
        //             System.out.println("  Value "+j+" = "+lottogroups[i][j]);
        //         }
                
        //     }        	
        // }

        int i =0;
        for(int[] lottogroup : lottogroups){
            System.out.println("Group :"+i);
            int j=0;
            for(int lottonumber : lottogroup){
                if(lottonumber%2==0){
                    System.out.println("  Value "+j+" = "+lottonumber);
                }
                j++;
            }
            i++;
        }
    }
}

