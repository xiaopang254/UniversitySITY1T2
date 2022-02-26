import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TryCollections {
    public void printLinkList(LinkedList<Integer> linkedList) {
        for (Iterator i = linkedList.iterator(); i.hasNext();) {
            System.out.print(i.next());

            if (i.hasNext() != false) {
                System.out.print(",");
            }
        }
    }

    public void printHashMap(HashMap<Integer, Integer> hashMap) {
        for (Integer name : hashMap.keySet()) {
            String key = hashMap.get(name).toString();
            System.out.print(key + " ");
        }
    }

    void bubbleSort(LinkedList<Integer> linkedList) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < linkedList.size(); i++) {
            arr.add(linkedList.get(i));
        }
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr.get(j) > arr.get(j + 1)) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
    }

    public void addAndSort(LinkedList<Integer> linkedList, int value) {

        System.out.print("Before add and sorted: ");
        printLinkList(linkedList);
        bubbleSort(linkedList);

        // find the smallest and equal value
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) >= value) {
                linkedList.add(i, value);
                break;
            }
        }

        System.out.print("\nAfter add and sorted: ");

        printLinkList(linkedList);

    }

    public void hashAddAndSort(HashMap<Integer, Integer> hashMap, int value) {

        hashMap.put(hashMap.size(), value);
        ArrayList<Integer> list = new ArrayList<Integer>(hashMap.values());
        System.out.print("Before sorted: ");
        printHashMap(hashMap);

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            var test = list.get(i);
            hashMap.put(i, list.get(i).intValue());
        }

        System.out.print("\nAfter sorted: ");
        printHashMap(hashMap);

    }

    public void swapValues(LinkedList<Integer> linkedList, int indexOne, int indexTwo) {

        System.out.print("\nBefore swapping: ");
        printLinkList(linkedList);
        Collections.swap(linkedList, indexOne, indexTwo);
        System.out.print("\nAfter swapping: ");
        printLinkList(linkedList);

    }

    public void hashSwapValues(HashMap<Integer, Integer> hashMap, int valueOneKey, int valueTwoKey) {

        System.out.print("\nBefore swapping: ");
        printHashMap(hashMap);
        int valueOne = hashMap.get(valueOneKey);
        int valueTwo = hashMap.get(valueTwoKey);
        hashMap.put(valueOneKey, valueTwo);
        hashMap.put(valueTwoKey, valueOne);
        System.out.print("\nAfter swapping: ");
        printHashMap(hashMap);

    }

    public int findValue(LinkedList<Integer> linkedList, int searchVal) {
        Collections.sort(linkedList);
        int value = Collections.binarySearch(linkedList, searchVal);

        if (value < 0) {
            return -1;
        }
        return value;

    }

    public int hashFindValue(HashMap<Integer, Integer> hashMap, int searchVal) {

        if (hashMap.containsValue(searchVal) == true) {
            for (int i = 0; i < hashMap.size(); i++) {
                var value = hashMap.get(i);
                if (value != null) {
                    if (value == searchVal) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }
}
