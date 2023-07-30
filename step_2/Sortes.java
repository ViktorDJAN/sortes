package org.example.step_one.step_2;

public class Sortes {
    public static void main(String[] args) {
        int[] arr1 = new int[] {4,8,7,6,5};
        directSort(arr1);
        print1(arr1);
    }
    public static void bubbleSort(int[] array){
        for (int out = array.length-1;out>1;out-- )
            for(int i = 0; i < out;i++){
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }

    }
    public static void directSort(int[] array){
        for(int i = 0; i<array.length-1;i++){
            int minPosition = i;
            for(int j = i+1;j< array.length;j++){
                if(array[j]< array[minPosition]){
                    minPosition = j;
                }
            }
            if(i != minPosition){
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] =  temp;
            }
        }
    }
    public static void print1(int[] arr){
        for (int num:   arr) {
            System.out.println(num);
        }

    }


}
