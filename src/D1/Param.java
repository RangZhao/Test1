package D1;

public class Param {
    public Param() {
    }

    public Param(String name) {
        this.name = name;
    }

    public String name;
    public static void main(String[] args) {
//        for (String arg : args) {
//            System.out.println(arg);
//        }
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
        Param param = null;
        try {
            param = new Param();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        param.method(1245,454,445,77454,454);
    }
    public void method(int... num){
        for (int i : num) {
            System.out.println(i);
        }
        Param param = new Param();
        Param p = new Param();
    }
}
