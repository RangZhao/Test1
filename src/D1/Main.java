package D1;

import java.util.Arrays;

public class Main {
    public int maxK(int[] arr,int k){
        Arrays.sort(arr);
        return arr[arr.length-k];
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
