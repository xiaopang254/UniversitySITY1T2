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

    private LinkedList<Integer> bubbleSort(LinkedList<Integer> linkedList) {
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
        for (int i = 0; i < linkedList.size(); i++) {
            if (arr.get(i) != linkedList.get(i)) {
                linkedList.set(i, arr.get(i));
            }

        }
        return linkedList;
    }

    public void addAndSort(LinkedList<Integer> linkedList, int value) {

        System.out.print("Before add and sorted: ");
        printLinkList(linkedList);
        linkedList.add(value);
        bubbleSort(linkedList);

        // // find the smallest and equal value
        // for (int i = 0; i < linkedList.size(); i++) {
        // if (linkedList.get(i) >= value) {
        // linkedList.add(i, value);
        // break;
        // }
        // }

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

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < linkedList.size(); i++) {
            arr.add(linkedList.get(i));
        }
        int n = arr.size();
        if (indexOne < n - 1 && indexTwo < n - 1) {
            int temp = arr.get(indexOne);
            arr.set(indexOne, arr.get(indexTwo));
            arr.set(indexTwo, temp);
        }

        for (int i = 0; i < linkedList.size(); i++) {
            if (arr.get(i) != linkedList.get(i)) {
                linkedList.set(i, arr.get(i));
            }
        }

        // Collections.swap(linkedList, indexOne, indexTwo);
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

        ArrayList<Integer> arr = new ArrayList<Integer>();
        Collections.sort(linkedList);
        for (int i = 0; i < linkedList.size(); i++) {
            arr.add(linkedList.get(i));
        }

        int first = 0;
        int last = arr.size();
        int key = searchVal;
        int mid = arr.size() / 2;
        while (first <= last) {
            if (arr.get(mid) < key) {
                first = mid + 1;
            } else if (arr.get(mid) == key) {
                return mid;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }

        // int value = Collections.binarySearch(linkedList, searchVal);

        // if (value < 0) {
        // return -1;
        // }
        // return value;

        return -1;

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
