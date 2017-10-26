package pl.waw.sgh;

public class EmailCheck {
    public static void main(String[] args) {
        final String EMAIL_OK = "user@sgh.pl";
        final String EMAIL_NOT_OK = "@sgh.pl";
        final String EMAIL_NOT_OK1 = "sgh.pl";
        final String EMAIL_NOT_OK2 = "a@sghpl.";
        final String EMAIL_NOT_OK3 = "a@sgh@pl.";
        String email = EMAIL_NOT_OK2;
       String s1 = "@";
       String s2 = ".";
       int a = email.indexOf(s1);
       int b = email.length()-1;
       int c = email.indexOf(s2);
       int d = email.lastIndexOf(s1);
        if(email.contains(s1) && email.contains(s2) && a!=0 && c!=b && a==b)
        {
            System.out.println("Email is OK");
        }
        else {
            System.out.println("Email is not OK");
            if(!email.contains(s1))
            {
                System.out.println("Email does not contain an @");
            }
            if(!email.contains(s2)){
                System.out.println("Email does not contain a dot");
            }
            if(b==0 || a==0 || c==b){
                System.out.println("Wrong domain");
            }
            if(a!=b){
                System.out.println("More than one @ in the email");
            }

    }
}}
