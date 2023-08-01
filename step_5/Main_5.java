package org.example.step_one.step_5;

import java.util.HashMap;

public class Main_5 {
    public static void main(String[] args) {
        Pair[] array = new Pair[10];
        Pair pair1 = new Pair("F",2);
        Pair pair2 = new Pair("A",2);
        Pair pair3 = new Pair("D",2);
        Pair pair4 = new Pair("E",2);

        array[pair1.key.hashCode()% array.length] = pair1;
        array[pair2.key.hashCode()% array.length] = pair2;
        array[pair3.key.hashCode()% array.length] = pair3;
        array[pair4.key.hashCode()% array.length] = pair4;


        for(int i = 0;i< array.length;i++){
            if(array[i] != null)
                System.out.print("["+array[i].key + ";"+ array[i].value + "] ");
            else
                System.out.print(" - ");
        }


    }
}

class Pair {
    String key;
    int value;

    public Pair(String key, int value) {
        this.key = key;
        this.value = value;
    }
}