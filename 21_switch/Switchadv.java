public class Switchadv {
    public static void handleObject(Object obj) {
        switch (obj) {
            // case String s -> System.out.println("String: " + s);
            //case Integer i -> System.out.println("Integer: " + i);
            // case Double d -> System.out.println("Double: " + d);
            //case List<?> l -> System.out.println("List with " + l.size() + " elements");
            default -> System.out.println("Unknown type: " + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        handleObject(3.14);
        handleObject("Hello");
        // handleObject(42);
        
        //handleObject(List.of(1, 2, 3));
        //handleObject(new Object());
    }
}
