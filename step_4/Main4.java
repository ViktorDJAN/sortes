package org.example.step_one.step_4;

import java.util.Iterator;

public class Main4 {
    public static void main(String[] args) {
        SingleLinkList<Integer>list2 = new SingleLinkList<>();
        list2.addToEnd(4);
        list2.addToEnd(5);
        list2.addToEnd(7);
        list2.addToEnd(9);
        System.out.println("before reverse");
         for (Integer integer : list2 ) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("after reverse");
         list2.reverse();
        for (Integer integer : list2 ) {
            System.out.print(integer + " ");
        }

    }

    public static class SingleLinkList<T> implements Iterable<T>{
        ListItem<T> head;
        ListItem<T>tail;

        @Override
        public Iterator<T> iterator() {
            return new Iterator<T>() {
                ListItem<T> current = head;

                @Override
                public boolean hasNext() {
                    return current != null;
                }

                @Override
                public T next() {
                    T data  = current.data;
                    current = current.next;
                    return data;
                }
            };
        }

        public static class ListItem<T>{
            T data;
            ListItem<T>next;
        }
        public boolean isEmpty(){
            return head ==null;
        }

        public void addToEnd(T item){
            ListItem<T> newItem = new ListItem<>();
            newItem.data = item;
            if (isEmpty()){
                 head = newItem;
                 tail = newItem;
            }
            else{
                tail.next = newItem;
                tail = newItem;
            }
        }
        public void reverse(){
            if(head.next!=null){
                tail = head;
                ListItem<T> current = head.next;
                head.next = null;
                while (current!=null){
                    ListItem<T>next = current.next; //  the link to the next element
                    current.next = head; // the link to the previous element
                    head = current;   // the link to the current element
                    current = next;

                }
            }
        }

    }

}
