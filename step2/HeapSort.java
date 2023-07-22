package org.example.step_one.step2;

public class HeapSort {
         public static void main(String[] args) {
            int[] arr = {1000,200,300,2,44,56,43};
            heapSort(arr);
            for(int i = 0;i< arr.length;i++){
                System.out.println(arr[i]);
            }
        }
        private static void heapSort(int[] arr){
            int n =  arr.length;
            for(int i = n/2-1;i>=0;i--){
                heapify(arr,i,n);
            }
            for(int i  = n-1;i>=0;i--) {
                int temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
                heapify(arr, 0, i);
            }
        }
        private static void heapify(int[] arr,int i,int n){
            int l = i*2 +1;
            int r = i*2 +2;
            int max = i;
            if(l<n && arr[l]>arr[max]) max = l;
            if(r<n && arr[r]>arr[max]) max = r;
            if(i != max){
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max]=temp;
                heapify(arr, max, n);
            }
        }
    }

