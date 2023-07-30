package org.example.step_one.step_3;

public class Example_1 {
    public static void main(String[] args) {
        Node node1 = new Node(5);
        Node node2 = new Node(6);
        Node node3 = new Node(7);
        Node node4 = new Node(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(node1.value + " ");
        System.out.println(node1.next.value + " ");
        System.out.println(node1.next.next.value + " ");
        System.out.println(node4.value + " ");

    }
}

class Node {
    int value;
    Node next;
    Node() {}
    Node (int value) {
        this.value = value;

    }
}
