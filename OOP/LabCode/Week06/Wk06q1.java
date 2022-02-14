import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Wk06q1 {

    public static void main(String[] args) {

        TryCollections collect = new TryCollections();
        LinkedList<Integer> linkList = new LinkedList<Integer>();
        linkList.add(1);
        linkList.add(3);
        linkList.add(5);
        linkList.add(7);
        linkList.add(9);
        linkList.add(11);

        System.out.println("Sorting using Collections!");
        System.out.print("Add a value: ");
        Scanner input = new Scanner(System.in);

        collect.addAndSort(linkList, input.nextInt());

        System.out.println("\n\nSwapping using Collections!");
        System.out.println("Choose which index to swap!");
        int indexOne = 0;
        int indexTwo = 0;
        collect.printLinkList(linkList);
        System.out.print("\nInsert for index 1: ");
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
        System.out.println("Enter number between 1000 to 9999: ");
        Scanner rInput = new Scanner(System.in);
        int rValue = rInput.nextInt();
        var rIndex = collect.findValue(bigLL, rValue);
        if (rIndex != -1) {
            System.out.println("Index found: " + rIndex);
        } else {
            System.out.println("Index not found.");
        }

    }

}