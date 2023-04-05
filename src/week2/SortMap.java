// Program to sort a map based on keys.

package week2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {

    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args){  
        map.put("Ash", 82);
        map.put("Max", 98);
        map.put("Natsu", 89);
        map.put("Gray", 74);
        map.put("Erza", 42);
 
        sortbykey();
    }

    public static void sortbykey()
    {
        TreeMap<String, Integer> tm = new TreeMap<>();
 
        tm.putAll(map);
 
        for (Map.Entry<String, Integer> entry : tm.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());       
    }
}
