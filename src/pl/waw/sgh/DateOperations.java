package pl.waw.sgh;


import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOperations {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatedDate = sdf.format(date);
        System.out.println(formatedDate);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        boolean succes = false;
        Date outDate = null;
        while (!succes){
            try {
                String inDate = JOptionPane.showInputDialog(null, "Please provide a date");
                        outDate = sdf2.parse(inDate);



                        succes=true;
            }
                catch (ParseException e){
                JOptionPane.showMessageDialog(null," Can't interpret the provided date, please try agiain");
                }
            }
            JOptionPane.showMessageDialog(null, "Succces, your date is "+sdf.format(outDate));
    }
}
