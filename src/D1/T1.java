package D1;

public class T1 {
public void print(){
    for (int i = 1; i <1000; i++) {
        int num=i;
        boolean flag=true;
        while (num!=0){
            if (num%10==5){
                flag=false;
                break;
            }
            num=num/10;
        }
        if (flag)System.out.println(i);
    }
}
public void s(int[] arr){
    int index =arr.length-1;int i=0;
    while (i<index){
        if (arr[i]==0){
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
            index--;
        }
        i++;
    }
}

    public static void main(String[] args) {
        new T1().print();
    }
}
