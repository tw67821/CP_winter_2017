package pl.waw.sgh;

public class forloop {
    public static void main(String[] args) {

        int c = 0;

        int d;
        d = c++;
        //d = ++c;
        int e;
        e = d;

        System.out.println("c=" +c);
        System.out.println("d="+d);
        System.out.println("e="+e);

        String s1 = "abc";

        Integer i1 = 35335;

        //s1 = s1 + i1;

        String s2 = i1.toString();
        s1= s1.concat(s2);



        for ( int i=0;i<5;i++) {
            System.out.println("i=" + i);
        }

        for (int j=5;j>0;j--) {
            if (j==4) continue;


            System.out.println("j="+j);
            if (j==2) break;


        }
    }
}
