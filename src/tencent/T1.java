package tencent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class T1{
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 6, 5, 4, 3, 2, 1};
        heapsort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void heapsort(int[] arr,int len){
        BuildMaxHeap(arr,len);
        for(int i=len;i>1;i--){
            int temp=arr[i];
            arr[i]=arr[1];
            arr[1]=temp;
            adjustDown(arr,1,i-1);
        }
    }
    static void BuildMaxHeap(int[] arr,int len){
        for(int i=len/2;i>0;i--){
            adjustDown(arr,i,len);
        }
    }

    private static void adjustDown(int[] arr, int k, int len) {
        arr[0]=arr[k];
        for(int i=2*k;i<=len;i*=2){
            if(i<len&&arr[i]<arr[i+1]){
                i++;
            }
            if(arr[0]>=arr[i]){
                break;
            }else{
                arr[k]=arr[i];
                k=i;
            }
        }
        arr[k]=arr[0];
    }
}

