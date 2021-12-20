package D1;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        if (s1.hasNext()){
            System.out.println(s1.nextLine());
        }
    }
}
