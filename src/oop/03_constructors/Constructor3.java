
public class Constructor3 {

    public Constructor3() {
        this("Favour", "Ozogbu");
        System.out.println("Running no-args constructor");

    }

    public Constructor3(String name, String surname) {
        this("Favour", "Ozogbu", "Programmer");
        System.out.println("Running name arg constructor: Name = " + name + surname);
    }
    public Constructor3(String name, String surname, String job){
        System.out.println(name + " " + surname+ " is a " + job);
    }
}
