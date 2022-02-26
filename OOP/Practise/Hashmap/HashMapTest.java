package Hashmap;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("CSC3002", "Integrated Work Study Programme");
        hashMap.put("CSC3007", "Information Visualisation");
        hashMap.put("CSC3009", "Machine Learning");
        hashMap.put("CSC1009", "Object-Oriented Programming");

        System.out.println("\nKeys: " + hashMap);
        System.out.println("Size: " + hashMap.size());
        hashMap.remove("CSC3007");

        System.out.println("Contents after deletion: " + hashMap);
        System.out.println("Size after deletion: " + hashMap.size());

        hashMap.put("CSC1009", "OH nO"); // value replaced.
        System.out.println("Contents after change: " + hashMap);
        System.out.println("Size after change: " + hashMap.size());

    }

}
