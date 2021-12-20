package tencent;
import java.util.*;

public class T2 {
    static  HashMap<Integer,HashSet<Integer>> b=new HashMap();
    static  HashMap<Integer,HashSet<Integer>> r=new HashMap();
    static  HashMap<Integer,HashSet<Integer>> c=new HashMap();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr=new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                arr[i][j]=in.nextInt();
                if(arr[i][j]!=0){
                    if(r.get(i)==null){
                        HashSet<Integer> set=new HashSet();
                        set.add(arr[i][j]);
                        r.put(i,set);
                    }else{
                        r.get(i).add(arr[i][j]);
                    }
                    if(c.get(j)==null){
                        HashSet<Integer> set=new HashSet();
                        set.add(arr[i][j]);
                        c.put(j,set);
                    }else{
                        c.get(j).add(arr[i][j]);
                    }
                    addC(i,j,arr[i][j],b);
                }else{
                    if(r.get(i)==null){
                        HashSet<Integer> set=new HashSet();
                        r.put(i,set);
                    }
                    if(c.get(j)==null){
                        HashSet<Integer> set=new HashSet();
                        c.put(j,set);
                    }
                    if(b.get(i/3*3+j/3)==null){
                        HashSet<Integer> set=new HashSet();
                        b.put(i/3*3+j/3,set);
                    }
                }
            }
        }
        System.out.println(b);
        System.out.println(c);
        System.out.println(r);
        for(int z=0;z<=8;z++){
            System.out.println(Arrays.toString(arr[z]));
        }
        find(arr,0,0);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for(int z=0;z<=8;z++){
            System.out.println(Arrays.toString(arr[z]));
        }

    }
    //7 2 6 9 0 4 0 5 1 0 8 0 6 0 7 4 3 2 3 4 1 0 8 5 0 0 9 0 5 2 4 6 8 0 0 7 0 3 7 0 0 0 6 8 0 0 9 0 0 0 3 0 1 0 0 0 0 0 0 0 0 0 0 9 0 0 0 2 1 5 0 0 8 0 0 3 0 0 0 0 0
    static boolean find(int[][] arr,int i,int j){
        boolean flag=false;
        if(arr[i][j]==0){
            for(int z=1;z<=9;z++){
                HashSet<Integer> setR= r.get(i);
                HashSet<Integer> setC= c.get(j);
                HashSet<Integer> setB= getC(i,j,arr[i][j]);
                if(!(setR.contains(z)||setC.contains(z)||setB.contains(z))){
                    setR.add(z);
                    setC.add(z);
                    setB.add(z);
                    arr[i][j]=z;
                    if(j==8&&i==8){
                        return true;
                    }
                    if(j<8){
                        flag= find(arr,i,j+1);
                    }else if(i<8){
                        flag= find(arr,i+1,0);
                    }
                    if (flag)break;
                    setR.remove(z);
                    setC.remove(z);
                    setB.remove(z);
                    arr[i][j]=0;
                }
            }
        }else {
            if(j<8){
                flag= find(arr,i,j+1);
            }else if(i<8){
                flag= find(arr,i+1,0);
            }
        }
        return flag;
    }
    static HashSet<Integer> getC(int i,int j,int num){
        if(0<=i&&i<=2){
            if(0<=j&&j<=2){
                return b.get(0);
            }else if(3<=j&&j<=5){
                return b.get(1);
            }else if(6<=j&&j<=8){
                return b.get(2);
            }
        }else if(3<=i&&i<=5){
            if(0<=j&&j<=2){
                return b.get(3);
            }else if(3<=j&&j<=5){
                return b.get(4);
            }else if(6<=j&&j<=8){
                return b.get(5);
            }
        }else{
            if(0<=j&&j<=2){
                return b.get(6);
            }else if(3<=j&&j<=5){
                return b.get(7);
            }else if(6<=j&&j<=8){
                return b.get(8);
            }
            return null;
        }
        return null;
    }
    static void addC(int i,int j,int num,HashMap<Integer,HashSet<Integer>> b){
        if(0<=i&&i<=2){
            if(0<=j&&j<=2){
                if(b.get(0)==null){
                    HashSet<Integer> set=new HashSet();
                    set.add(num);
                    b.put(0,set);
                }else{
                    b.get(0).add(num);
                }
            }else if(3<=j&&j<=5){
                if(b.get(1)==null){
                    HashSet<Integer> set=new HashSet();
                    set.add(num);
                    b.put(1,set);
                }else{
                    b.get(1).add(num);
                }
            }else if(6<=j&&j<=8){
                if(b.get(2)==null){
                    HashSet<Integer> set=new HashSet();
                    set.add(num);
                    b.put(2,set);
                }else{
                    b.get(2).add(num);
                }
            }
        }else if(3<=i&&i<=5){
            if(0<=j&&j<=2){
                if(b.get(3)==null){
                    HashSet<Integer> set=new HashSet();
                    set.add(num);
                    b.put(3,set);
                }else{
                    b.get(3).add(num);
                }
            }else if(3<=j&&j<=5){
                if(b.get(4)==null){
                    HashSet<Integer> set=new HashSet();
                    set.add(num);
                    b.put(4,set);
                }else{
                    b.get(4).add(num);
                }
            }else if(6<=j&&j<=8){
                if(b.get(5)==null){
                    HashSet<Integer> set=new HashSet();
                    set.add(num);
                    b.put(5,set);
                }else{
                    b.get(5).add(num);
                }
            }
        }else if(6<=i&&i<=8){
            if(0<=j&&j<=2){
                if(b.get(6)==null){
                    HashSet<Integer> set=new HashSet();
                    set.add(num);
                    b.put(6,set);
                }else{
                    b.get(6).add(num);
                }
            }else if(3<=j&&j<=5){
                if(b.get(7)==null){
                    HashSet<Integer> set=new HashSet();
                    set.add(num);
                    b.put(7,set);
                }else{
                    b.get(7).add(num);
                }
            }else if(6<=j&&j<=8){
                if(b.get(8)==null){
                    HashSet<Integer> set=new HashSet();
                    set.add(num);
                    b.put(8,set);
                }else{
                    b.get(8).add(num);
                }
            }
        }
    }
}
