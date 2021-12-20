package huawei;

import java.util.Arrays;
import java.util.Comparator;

public class T2 {
    public static void main(String[] args) {
        String [] res=new T2().main1("abc abcd efgh efghi ab, jkl hello world word iostream ggggg ffffffff a  b c a，y yes no right ok a abc.");
        for (String re : res) {
            System.out.print(re+" ");
        }
    }
    String[] main1(String s){
        String[] arr=s.split(" ");
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()==o2.length()){
                    return o2.compareTo(o1);
                }else {
                    return o2.length()-o1.length();
                }
            }
        });
        return arr;
    }
}
