import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TryCollections {
    public void printLinkList(LinkedList<Integer> linkedList) {
        for (Iterator i = linkedList.iterator(); i.hasNext();) {
            System.out.print(i.next());

            if (i.hasNext() != false) {
                System.out.print(",");
            }
        }
    }

    public void addAndSort(LinkedList<Integer> linkedList, int value) {

        linkedList.add(value);
        System.out.print("Before sorted: ");
        printLinkList(linkedList);

        Collections.sort(linkedList);

        System.out.print("\nAfter sorted: ");
        printLinkList(linkedList);

    }

    public void swapValues(LinkedList<Integer> linkedList, int indexOne, int indexTwo) {

        System.out.print("\nBefore swapping: ");
        printLinkList(linkedList);
        Collections.swap(linkedList, indexOne, indexTwo);
        System.out.print("\nAfter swapping: ");
        printLinkList(linkedList);

    }

    public int findValue(LinkedList<Integer> linkedList, int searchVal) {
        Collections.sort(linkedList);
        int value = Collections.binarySearch(linkedList, searchVal);

        if (value < 0) {
            return -1;
        }
        return value;

    }
}
