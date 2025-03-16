import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapTst1 {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("key1", "A");
		hashMap.put("key2", "B");
		hashMap.put("key3", "C");
		hashMap.put("key4", "D");
		hashMap.put("key5", "E");
		hashMap.put("key6", "F");
		
		Set<String> keySet = hashMap.keySet();		
		Collection<String> values = hashMap.values();


        ArrayList<String> listValues = new ArrayList<>(values);//putting the contents of values Collection into a list
        // Collections.sort(listValues);//could sort the list

        System.out.println("hashmap values");
        //iterating through list containing values
        for (int i=0; i<listValues.size(); i++) {
            System.out.println(listValues.get(i));
        }
		System.out.println("");


        Object[] arrayKeys = keySet.toArray();
        // Arrays.sort(arrayKeys);//could sort the array

        System.out.println("hashmap keys");
        //iterating through array containing keys
        for (int i=0; i<arrayKeys.length; i++) {
            System.out.println(arrayKeys[i]);
        }
        System.out.println("");

        hashMap.put("12", "Number 1");
        hashMap.put("13", "Number 2");
        hashMap.put("24", "Number 3");
        hashMap.put("33", "Number 4");
        hashMap.put("rr", "Number 5");
        hashMap.put("gt", "Number 6");
        hashMap.put("qq", "Number 7");

        hashMap.put("Favour", "Ozogbu");
        hashMap.put("Mark", "Johnson");

        hashMap.put("Dubai", "UAE");
        hashMap.put("Nairobi", "Kenya");

        Set<String> keySet1 = hashMap.keySet();
        Collection<String> values2 = hashMap.values();

        ArrayList<String> keyList = new ArrayList<>(keySet1);
        ArrayList<String> valueList = new ArrayList<>(values2);

        // Collections.sort(valueList);
        // Collections.sort(keyList);

        System.out.println("New hashmap values");
        //iterating through list containing values
        for (int i=0; i<valueList.size(); i++) {
            System.out.println(valueList.get(i));
        }
        System.out.println("");

        System.out.println("New hashmap keys");
        //iterating through list containing keys
        for (int i=0; i<keyList.size(); i++) {
            System.out.println(keyList.get(i));
        }
        

	}	
}

