package huawei;

import java.util.ArrayList;
import java.util.List;

public class T1 {
    static int max;
    public int maxLength(List<String> arr) {
        boolean[] flag=new boolean[26];
        max=0;
        s(arr,0,flag, new StringBuilder());
        return max;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abcdefg");
        list.add("iq");
        list.add("ue");
        System.out.println(new T1().maxLength(list));
    }
    private void s(List<String> arr, int index, boolean[] flag, StringBuilder builder) {

        if (index < arr.size()) {
            s(arr, index + 1, flag, builder);
            String s = arr.get(index);

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (flag[c - 'a']){
                    j--;
                    while (j>=0){
                        flag[s.charAt(j)-'a']=false;
                        builder.deleteCharAt(builder.length()-1);
                        j--;
                    }
                    return;
                }
                else {
                    flag[c - 'a'] = true;
                    builder.append(c);
                }
            }
            System.out.println(builder);
            s(arr,index+1,flag,builder);
            int j=s.length()-1;
            while (j>=0){
                flag[s.charAt(j)-'a']=false;
                builder.deleteCharAt(builder.length()-1);
                j--;
            }
        } else {
            System.out.println(builder);
            max = Math.max(builder.length(), max);
        }

    }
}

