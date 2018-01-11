package pl.waw.sgh.bank.ui;

import pl.waw.sgh.bank.Bank;
import pl.waw.sgh.bank.Customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BankingApp {
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    public void setTabbedPane1(JTabbedPane tabbedPane1) {
        this.tabbedPane1 = tabbedPane1;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JLabel getFromAccLabel() {
        return fromAccLabel;
    }

    public void setFromAccLabel(JLabel fromAccLabel) {
        this.fromAccLabel = fromAccLabel;
    }

    public JTextField getFromAccField() {
        return fromAccField;
    }

    public void setFromAccField(JTextField fromAccField) {
        this.fromAccField = fromAccField;
    }

    public JLabel getToAccLabel() {
        return toAccLabel;
    }

    public void setToAccLabel(JLabel toAccLabel) {
        this.toAccLabel = toAccLabel;
    }

    public JTextField getToAccField() {
        return toAccField;
    }

    public void setToAccField(JTextField toAccField) {
        this.toAccField = toAccField;
    }

    public JLabel getAmountLabel() {
        return amountLabel;
    }

    public void setAmountLabel(JLabel amountLabel) {
        this.amountLabel = amountLabel;
    }

    public JTextField getAmountField() {
        return amountField;
    }

    public void setAmountField(JTextField amountField) {
        this.amountField = amountField;
    }

    public JButton getGoButton() {
        return goButton;
    }

    public void setGoButton(JButton goButton) {
        this.goButton = goButton;
    }


    private JLabel fromAccLabel;
    private JTextField fromAccField;
    private JLabel toAccLabel;
    private JTextField toAccField;
    private JLabel amountLabel;
    private JTextField amountField;
    private JButton goButton;



    private void createUIComponents() {
        // TODO: place custom component creation code here
    }




}
