package linkedlists;

import java.util.List;
import java.util.Objects;

public class CycleDetection {

    public void main(String[] args) {

        List<Integer> nums = List.of(5, 4, 3, 2, 1);

        Node root = null;

        for (int i = 0; i < nums.size(); i++) {
            root = insertEnd(root, nums.get(i));
        }

        // set the cycle
        Node rootTmp = root;
        Node tmp = null;
        while (rootTmp.next != null) {
            if (rootTmp.value == 3) {
                tmp = rootTmp;
            }

            rootTmp = rootTmp.next;

            if (rootTmp.next == null) {
                rootTmp.next = tmp;
                break;
            }
        }

        // Method display with logic to detect cycle
        display(root);

    }

    Node removeNode(Node root, int target) {
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

    Node insertAtFront(Node root, int new_data) {

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

    void display(Node root) {

        var fast = root;
        var slow = root;

        boolean hasCycle;

        while (fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            System.out.print(fast.value + " -> ");

            if (fast == slow) {
                hasCycle = true;
                System.out.print("Detected Cycle");

                break;
            }
        }
        System.out.print("\n");

        System.out.println("slow : " + slow.toString() + "\nfast : " + fast.toString());

    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value : " + value + ", next value: " + (Objects.isNull(next) ? "null" : next.value);
        }
    }

}

