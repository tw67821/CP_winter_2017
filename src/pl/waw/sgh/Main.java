package pl.waw.sgh;

public class Main {
    public static void main(String[] args) {
        byte b1;
        b1 = 56;

        int a = 676;
        a = a + b1;

        float f1 = 1353535353;

        double d1 = -5.5675*10e9;
/*
  && - AND
  || - OR
  */
        boolean p = true && false;
        boolean q = true || false;

        char c = 't';
        String abc = "my text\nthis should be in a new line\tnew tab";
        System.out.println("c=" + c + ", abc=" + abc);

        System.out.println("b1=" + b1);
        System.out.println("f1=" + f1);
        System.out.println("d1=" + d1);

        System.out.println("p=" + p);
        System.out.println("q=" + q);

        System.out.println("Hello!");

        int a2 = 5656;
        Integer a3 = 45644;

        a3 = a2+a3;
        a2 = a3+a2;
        System.out.println("a3=" + a3);
    }
}
