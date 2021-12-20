public class T1 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,8,9,10,100,250};
        int s= find(arr,100);
        System.out.println(s);
    }
    public static int find(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        while (l<r){
            int mid =l+(r-l)/2;
            if (arr[mid]==target)return mid;
            else if (arr[mid]<target){
                l=mid+1;
            } else {
                r=mid-1;
            }
        }
        return -1;
    }

}
