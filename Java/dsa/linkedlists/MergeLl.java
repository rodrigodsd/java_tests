package linkedlists;

import java.util.List;

public class MergeLl {

    public void main(String[] args) {

        List<Integer> nums1 = List.of(1, 2, 4);
        List<Integer> nums2 = List.of(3, 5);

        Node root1 = null;
        for (int i = 0; i < nums1.size(); i++) {
            root1 = insertEnd(root1, nums1.get(i));
        }

        Node root2 = null;
        for (int i = 0; i < nums2.size(); i++) {
            root2 = insertEnd(root2, nums2.get(i));
        }

        Node head = null;

        if (root1.value < root2.value) {
            head = root1;
            root1 = root1.next;
        } else {
            head = root2;
            root2 = root2.next;
        }

        Node tail = head;

        while (root1 != null && root2 != null) {
            if (root1.value < root2.value) {
                tail.next = root1;
                root1 = root1.next;
            } else {
                tail.next = root2;
                root2 = root2.next;
            }
            tail = tail.next;
        }

        if (root2 != null) {
            tail.next = root2;
        } else {
            tail.next = root1;
        }

        display(head);

    }

    public Node removeNode(Node root, int target) {
        Node curr = root;
        Node prev = null;
        while (curr.next != null) {

            if (curr.value == target) {
                prev.next = curr.next;
                break;
            }

            prev = curr;
            curr = curr.next;
        }
        return root;
    }

    public Node insertAtFront(Node root, int new_data) {

        // Create a new node with the given data
        Node new_node = new Node(new_data);

        // Make the next of the new node point to the
        // current head
        new_node.next = root;

        // Return the new node as the new head of the list
        return new_node;
    }

    Node insertEnd(Node root, Integer value) {
        Node newNode = new Node(value);

        if (root == null) {
            return newNode;
        }

        // set the last as the last node of list with next == null;
        Node last = root;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        return root;
    }

    public void display(Node root) {
        while (root != null) {
            System.out.print(root.value + " -> ");
            root = root.next;
        }
        System.out.print("\n");
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}

