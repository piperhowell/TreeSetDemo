/**
 * Piper Howell
 * ITEC 302
 * TreeSet Demo
 */

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {
    private TreeSet<Integer> treeSet;
    private Scanner scanner;

    public TreeSetDemo() {
        this.treeSet = new TreeSet<>();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Adds an element to the TreeSet.
     * TreeSet maintains its balance using a Red-Black Tree.
     * Red-Black Tree is a self-balancing binary search tree.
     * It ensures that the tree remains approximately balanced
     * after insertions and deletions, which guarantees
     * logarithmic time complexity for most operations.
     *
     * @param element The element to be added to the TreeSet.
     */
    public void addElement(int element) {
        treeSet.add(element);
        System.out.println("Element " + element + " added to the TreeSet.");
        displayTree(); // Display the contents after adding
    }

    /**
     * Removes an element from the TreeSet.
     *
     * @param element The element to be removed from the TreeSet.
     */
    public void removeElement(int element) {
        if (treeSet.contains(element)) {
            treeSet.remove(element);
            System.out.println("Element " + element + " removed from the TreeSet.");
            displayTree(); // Display the contents after removing
        } else {
            System.out.println("Element " + element + " not found in the TreeSet.");
        }
    }

    /**
     * Displays the contents of the TreeSet.
     */
    public void displayTree() {
        System.out.println("Contents of the TreeSet: " + treeSet);
    }

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("\n1. Add element\n2. Remove element\n3. Display TreeSet\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int addElement = scanner.nextInt();
                    addElement(addElement);
                    break;
                case 2:
                    System.out.print("Enter element to remove: ");
                    int removeElement = scanner.nextInt();
                    removeElement(removeElement);
                    break;
                case 3:
                    displayTree();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        TreeSetDemo demo = new TreeSetDemo();
        demo.run();
    }
}
