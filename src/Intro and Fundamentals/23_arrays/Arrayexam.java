
import java.util.Arrays;

class Arrayexam {
    static void main(String[] args) {
        int[] num = new int[] {1,2,3,4,5};
        for (int elem : num) {
            System.out.println(elem);
        }

        System.out.println(Arrays.toString(num));
    }
}
