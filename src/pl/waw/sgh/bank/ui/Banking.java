package pl.waw.sgh.bank.ui;

import javax.swing.*;

public class Banking {

    public static void main(String[] args) {
        JFrame myBank = new JFrame("My Bank");
        myBank.setSize(600,600);
        Charge charge = new Charge();
        myBank.add(charge.getMainPanel());
        myBank.setVisible(true);


    }

}