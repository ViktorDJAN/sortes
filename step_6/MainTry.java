package org.example.step_one.step_6;

import java.util.Random;

public class MainTry {
    public static void main(String[] args) {
        Main_6.BinTree tree = new Main_6.BinTree<>();
        for(int i = 0; i< 10;i++){
            int r = new Random().nextInt(20);
            tree.add(r);
            System.out.print(r+ " ");
        }
        tree.print();

    }
}
