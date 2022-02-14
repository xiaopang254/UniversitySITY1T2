import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Wk06 {

    public static void main(String[] args) {

        TryCollections collect = new TryCollections();
        LinkedList<Integer> linkList = new LinkedList<Integer>();
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        linkList.add(1);
        linkList.add(3);
        linkList.add(5);
        linkList.add(7);
        linkList.add(9);
        linkList.add(11);

        hashMap.put(0, 1);
        hashMap.put(1, 3);
        hashMap.put(2, 5);
        hashMap.put(3, 7);
        hashMap.put(4, 9);
        hashMap.put(5, 11);

        System.out.println("Sorting using Collections!");
        System.out.print("Add a value: ");
        Scanner input = new Scanner(System.in);

        collect.addAndSort(linkList, input.nextInt());

        System.out.println("\n\nSwapping using Collections!");
        System.out.println("Choose which index to swap!");
        int indexOne = 0;
        int indexTwo = 0;
        collect.printLinkList(linkList);
        System.out.print("\nInsert two index: ");
        Scanner inputIndex = new Scanner(System.in);
        indexOne = inputIndex.nextInt();
        indexTwo = inputIndex.nextInt();
        collect.swapValues(linkList, indexOne, indexTwo);

        System.out.println("\n\nFinding value using Collections!");

        Random random = new Random();
        LinkedList<Integer> bigLL = new LinkedList<Integer>();
        int min = 500;
        int max = 9999;
        int randomValue;

        for (int i = min; i <= max; i++) {
        randomValue = random.nextInt(max - min) + min;
        bigLL.add(randomValue);

        }
        System.out.println("\nFind your value using COLLECTIONS BINARY SEARCH!!");
        System.out.println("Enter number between 1000 to 9999: ");
        Scanner rInput = new Scanner(System.in);
        int rValue = rInput.nextInt();
        var rIndex = collect.findValue(bigLL, rValue);
        if (rIndex != -1) {
        System.out.println("Index found: " + rIndex);
        } else {
        System.out.println("Index not found.");
        }

        System.out.println("\n\n\n Using HashMap!!");

        System.out.println("Sorting using Hash Collections!");
        System.out.print("Add a value: ");
        Scanner inputSortHash = new Scanner(System.in);
        collect.hashAddAndSort(hashMap, inputSortHash.nextInt());

        System.out.println("\n\nSwapping using Hash Collections!");
        System.out.println("Choose which index to swap!");
        collect.printHashMap(hashMap);;
        System.out.print("\nInsert two index: ");
        Scanner inputIndexHash = new Scanner(System.in);
        int indexOneHash = inputIndexHash.nextInt();
        int indexTwoHash = inputIndexHash.nextInt();
        collect.hashSwapValues(hashMap, indexOneHash, indexTwoHash);

        Random randomValuesHash = new Random();
        HashMap<Integer,Integer>bigHashMap = new HashMap<Integer,Integer>();
        int randomValue1;

        for (int i = min; i <= max; i++) {
            randomValue1 = randomValuesHash.nextInt(max - min) + min;
            bigHashMap.put(i, randomValue1);

        }
        System.out.println("\nFind your value using HASH MAP!");
        System.out.println("Enter number between 1000 to 9999: ");
        Scanner rHashInput = new Scanner(System.in);
        int rHashValue = rHashInput.nextInt();
        var rHashIndex = collect.hashFindValue(bigHashMap, rHashValue);
        if (rHashIndex != -1) {
            System.out.println("Index found: " + rHashIndex);
        } else {
            System.out.println("Index not found.");
        }

    }

}