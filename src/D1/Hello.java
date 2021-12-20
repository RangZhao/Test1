package D1;

import java.io.Serializable;

/**
 *
 */

public class Hello implements Serializable {
    String name;

    /**
     * @author huang
     * @param name
     * @return
     * @throws Exception
     */
    public String test(String name) throws Exception{
        return name;
    }
    public static void main(String[] args) {
        System.out.println("Hello,World!");
        Integer i = 100;
        int i1 = 128;
        byte b1 = (byte) i1;
        System.out.println(b1);
        System.out.println(b1);
        System.out.println(b1);
        System.out.println(b1);
        Math.pow(2, 3);
        System.out.println('a'+1+2);



    }

    /*
     */
    //
    /**
     * @Description HelloWorld
     */
}
