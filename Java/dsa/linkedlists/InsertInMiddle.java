package linkedlists;

import java.io.IOException;
import java.util.List;

public class InsertInMiddle {
    public static void main(String[] args) throws IOException {

        List<Integer> nums = List.of(1, 2, 4, 5);

        DoublyLinkedList llist = new DoublyLinkedList();

        for (int i = 0; i < nums.size(); i++) {
            llist.insertNode(nums.get(i));
        }

        llist.sortedInsert(llist.head, 3);

        DoublyLinkedListPrintHelper.printList(llist.head);

    }
}


class DoublyLinkedListNode {
    public int data;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public DoublyLinkedListNode sortedInsert(DoublyLinkedListNode node, int data) {

        DoublyLinkedListNode head = node;

        while (node.next != null) {

            if (data > node.data && data <= node.next.data) {
                DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
                DoublyLinkedListNode tmp = node.next;
                node.next = newNode;
                newNode.next = tmp;
                newNode.prev = node;
            }

            node = node.next;

        }

        return head;

    }

    public void insertNode(int nodeData) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }

        this.tail = node;
    }
}

class DoublyLinkedListPrintHelper {
    public static void printList(DoublyLinkedListNode root) throws IOException {
        while (root != null) {
            System.out.print(root.data + " -> ");
            root = root.next;
        }
        System.out.print("\n");
    }
}

class Result {

    /*
     * Complete the 'sortedInsert' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_DOUBLY_LINKED_LIST llist
     *  2. INTEGER data
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */


}

