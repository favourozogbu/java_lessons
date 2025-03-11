import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add("apple");
        list.add("orange");

        System.out.println("List contents after add()");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");
        
        list.remove("apple");
        
        System.out.println("List contents after remove()");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");

        list.clear();

        System.out.println("List contents after clear()");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");
        
        System.out.println("The size of list is "+list.size());
        System.out.println("");
        
        list.add("banana");
        list.add(1,"apple");//2nd way to add()
        list.add("orange");

        System.out.println("Added 3 elements to the list\nList contents after add()");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");

        System.out.println("Does the list contain orange?"+list.contains("orange"));
        System.out.println("");

        System.out.println("The index 0 element in list is "+list.get(0));
        System.out.println("");

        System.out.println("List contents after get()");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("watermelon");
        list2.add("apple");
        list2.add("pear");

        System.out.println("New list created called list2 \n List2 contents after add()");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        System.out.println("");

        list.addAll(list2);

        System.out.println("Original List contents after addAll(list2)");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");

        System.out.println("List2 contents ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        System.out.println("");

        System.out.println("list.containsAll(list2) used");
        System.out.println("Does list contain all of list2? "+list.containsAll(list2));
        System.out.println("");

        Iterator<String> iterator = list.iterator();
        
        System.out.println("using iterator() to iterate through list");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("");

        System.out.println("contents of array using list.toArray()");
        Object[] listArray = list.toArray();

        for(int i=0; i<listArray.length; i++){
            System.out.println(listArray[i]);
        }






        
        
    }
}
