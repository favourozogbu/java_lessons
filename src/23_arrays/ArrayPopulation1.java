public class ArrayPopulation1 {
    public static void main(String[] args) {
        // Declare empty arrays of size 10 for each primitive type
        int[] intArray = new int[10];
        double[] doubleArray = new double[10];
        float[] floatArray = new float[10];
        long[] longArray = new long[10];
        short[] shortArray = new short[10];
        byte[] byteArray = new byte[10];
        char[] charArray = new char[10];  // Default is '\u0000' (null character)
        boolean[] booleanArray = new boolean[10];  // Default is false
        String[] stringArray = new String[10];  // Default is null

        // Pretty Print Default Values
        printArray("intArray: ", intArray);
        printArray("doubleArray: ", doubleArray);
        printArray("floatArray: ", floatArray);
        printArray("longArray: ", longArray);
        printArray("shortArray: ", shortArray);
        printArray("byteArray: ", byteArray);
        printArray("charArray: ", charArray);  // Convert int to char
        printArray("booleanArray: ", booleanArray);  // Convert int to boolean
        printArray("stringArray: ", stringArray);  // Default is null
    }

    // Generic print function for Object arrays
    public static void printArray(String prefix, Object[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    // Overloaded method for int arrays
    public static void printArray(String prefix, int[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, double[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, float[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, long[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, short[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, byte[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, char[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i] == '\u0000' ? "null" : arrayToPrint[i]); // Show 'null' for empty char
            if (i != arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, boolean[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    // Convert int array to char array (casting int to char)
    public static char[] convertCharArray(int[] arr) {
        char[] charArray = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            charArray[i] = (char) (arr[i] + 65);  // Convert int to a printable char
        }
        return charArray;
    }

    // Convert int array to boolean array (0 -> false, others -> true)
    public static boolean[] convertBooleanArray(int[] arr) {
        boolean[] boolArray = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boolArray[i] = arr[i] != 0;  // Convert int to boolean
        }
        return boolArray;
    }
}
