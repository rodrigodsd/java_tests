package linkedlists;

import java.util.List;

public class LinkedList {

    public void main(String[] args) {

        List<Integer> nums = List.of(5, 4, 3, 2, 1);

        Node root = null;

        for (int i = 0; i < nums.size(); i++) {
            root = insertEnd(root, nums.get(i));
        }

        display(root);

        root = insertAtFront(root, 9);

        display(root);

        root = removeNode(root, 3);

        display(root);

    }

    public Node removeNode(Node root, int target) {
        Node curr = root;
        Node prev = null;
        while (curr.next != null) {

            if(curr.value == target){
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

}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

