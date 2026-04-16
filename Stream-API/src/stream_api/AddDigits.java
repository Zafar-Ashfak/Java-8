
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it
package stream_api;

import LinkedList.LinkedList;


public class AddDigits {
    public static class Node {
        int data;
        LinkedList.Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static LinkedList.LinkedList.Node head;
    public static LinkedList.LinkedList.Node tail;
    public static int size = 0;

    // ************* METHODS **************

    //    1. Add Node at First of the LinkedList
    public void addFirst(int data) {
        LinkedList.LinkedList.Node newNode = new LinkedList.LinkedList.Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // 2. Add Node at the last of the LinkedList
    public void addLast(int data) {
        LinkedList.LinkedList.Node newNode = new LinkedList.LinkedList.Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // 3. Add in the middle
    public void add(int idx, int data) {
        LinkedList.LinkedList.Node newNode = new LinkedList.LinkedList.Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        int i = 0;
        LinkedList.LinkedList.Node temp = head;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //  Remove first Node of the LinkedList
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
    }

    //  Remove last Node of the LinkedList
    public int removeLast() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            LinkedList.LinkedList.Node prev = head;
            int i = 0;
            while (i < size - 2) {
                prev = prev.next;
                i++;
            }
            int val = tail.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;

        }
    }

    //  Search a key in the LinkedList (Iterative)
    public int itrSearch(int key) {
        LinkedList.LinkedList.Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
    }

    //  Search a key in the LinkedList (Recursive)
    public int recSearch(int key) {
        return helper(head, key);
    }

    public static int helper(LinkedList.LinkedList.Node head, int key) {
        // Base Case
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

//    public int searchRecursive(int key) {
//        return helper(head, key);
//    }

    //  Reverse a LinkedList
    public void reverseLinkedList() {
        LinkedList.LinkedList.Node prev = null;
        LinkedList.LinkedList.Node curr = tail = head;
        LinkedList.LinkedList.Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    //  Find And Remove nth Node From End

    // Print the LinkedList
    public void printLinkedList() {
        LinkedList.LinkedList.Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static int addDigits(int num) {
        return num % 9 == 0 ? 9 : num % 9;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(85771));
    }
}
