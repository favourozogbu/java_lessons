public class DeepArrayBasics{
    public static void main(String[] args){
        int[] array = new int[50];
        //populate
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        printArray(array);//print
        add1(array);//add1
        printArray(array);//print
        evenAndDivBy11(array);
    }
    public static void printArray(int[] array){
        int i = 0; 
        while (i < array.length) {
            System.out.print(array[i]+" ");
            i++;
        }
        System.out.println("");
        System.out.println("");
    }

    public static void add1(int[] array) {
        int i = 0; 
        while (i < array.length) {
            array[i]+=1;
            i++;
        }
    }

    public static void evenAndDivBy11(int[] array) {
        int i = 0; 
        while (i < array.length) {
            // if(array[i]%2==0 && array[i]%11==0){
            //     System.out.print(array[i]+" ");
            // } 
            switch ((array[i]%2==0 && array[i]%11==0) ? 0 : 1) {
                case 0: System.out.println(array[i]);
                    break;
                // default :  throw new AssertionError();
            }
            i++;
        }
        System.out.println("");
        System.out.println("");
    }
}