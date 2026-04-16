package stream_api;

import LinkedList.LinkedList1;

import java.util.Comparator;
import java.util.List;

public class FilterAndMap {

    public static class Node {
        int data;
        LinkedList1.Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static LinkedList1.Node head;
    public static LinkedList1.Node tail;
    public static int size;

    public void addLast(int data) {
        LinkedList1.Node newNode = new LinkedList1.Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public LinkedList1.Node findMidNode(LinkedList1.Node head) {
        LinkedList1.Node slow = head;
        LinkedList1.Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle node
        LinkedList1.Node mid = findMidNode(head);

        // Divide the LinkedList in two halves and reverse the 2nd half (right)
        LinkedList1.Node prev = null;
        LinkedList1.Node curr = mid;
        LinkedList1.Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        LinkedList1.Node left = head;
        LinkedList1.Node right = prev;

        // Check both LinkedList are palindrome
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right  = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Ball", "King", "Dog", "Ant", "Girl", "Mango", "Train", "Ink", "Queen", "Flower");

        // Filter method
//        words.stream().filter(e -> e.startsWith("A")).forEach(System.out::println);
        words.stream().filter(e -> e.length() < 5).forEach(System.out::println);

        List<Integer> nums = List.of(2, 6, 3, 9, 10, 5, 7, 11, 32, 44, 14);

        // Map method
        System.out.println("Square of each element");
        nums.stream().map(e -> e * e).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // Sorted in ascending order method
       List<Integer> sortedAsc = nums.stream().sorted().toList();
        System.out.println("Ascending Order sorting");
        System.out.println(sortedAsc);

        // Sorted in descending order method
        List<Integer> sortedDesc = nums.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Descending Order sorting");
        System.out.println(sortedDesc);

        // Get min element from the list
        Integer min = nums.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min element is: " + min);

        // Get Max element from the list
        Integer max = nums.stream().max(Integer::compareTo).get();
        System.out.println("Max element is: " + max);
    }
}
