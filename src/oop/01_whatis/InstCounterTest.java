
public class InstCounterTest {

    public static void main(String[] args) {
        InstanceCounter obj1 = new InstanceCounter();
        InstanceCounter obj2 = new InstanceCounter();
        InstanceCounter obj3 = new InstanceCounter();

        //sysout InstanceCounter.staticCounter
        System.out.println("Static counter before change: "+ InstanceCounter.getStaticCounter());

        InstanceCounter.staticCounter = 1000;

        //sysout InstanceCounter.staticCounter4
        System.out.println("Static counter after change: "+ InstanceCounter.getStaticCounter());
        //increment object counter 1
        obj1.incrementObjectCounter();
        //increment static counter = 1001
        InstanceCounter.incrementStaticCounter();
        

        
    }
}
