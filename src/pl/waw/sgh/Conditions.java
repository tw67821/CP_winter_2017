package pl.waw.sgh;

public class Conditions {
    public static void main(String[] args) {
        int b = 5;
        {   int a = 5;

            System.out.println("Run from a sub block");
            System.out.println("a=" + a);
            System.out.println("b=" + b);





        }
        //TODO sth to do
        //System.out.println("a=" + a);
        //System.out.println("b=" + b);



        boolean myCond = false;

          if (!myCond){
            System.out.println("myCond is true");}
          else{
            System.out.println("myCond is false");
    }{

    if (b>=3){

        System.out.println("b >= 3");
    }}
    String s1= "abc";
    String s2= "abc";

    String s3= new String("abc");
     if (s1==s2) {
         System.out.println("String s1 and s2 equal");
     }
     if (s1==s2){
         System.out.println();
     }
    int c;
     if (b>4)
    c=b;
     else
          c=2;

     c= b>4 ? b :2;


          }}








