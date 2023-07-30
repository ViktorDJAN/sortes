package org.example.step_one.step_3;

public class LinkedLisst {
    private  Node root;
    private int size;

    public int size(){
        return size;
    }
    public void add(int value){
        if(root == null){
            root = new Node(value);
            size =1;
            return;
        }
        Node currentNode = root;
        while (currentNode.next !=null){
            currentNode = currentNode.next;
        }
            currentNode.next = new Node(value);
            size++;


    }

    public void print(){
        Node currentNode = root;
        while(currentNode!=null){
            System.out.println(currentNode.value+" " + size);
            currentNode = currentNode.next;
        }
    }



    private class Node {
        int value;
        Node next;
        Node() {
        }
        Node(int value) {
            this.value = value;
        }
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
