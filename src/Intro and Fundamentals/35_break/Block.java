public class Block {
    public static void main(String[] args) {
        int sum = 0;
        {
           int i =1;
           System.out.println("Block 1 i = "+ i);
           sum += i;
        }
       
        {
            int i =1;
            System.out.println("Block 2 i = "+ i);
            sum += i;            
        }

        System.out.println("Sum of block 1 i and block 2 i: "+sum);
       
    }
}
