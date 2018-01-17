package pl.waw.sgh.bank.ui;

import javax.swing.*;

public class Deposit {
    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    public void setTabbedPane1(JTabbedPane tabbedPane1) {
        this.tabbedPane1 = tabbedPane1;
    }

    public JLabel getToAccountLabel() {
        return toAccountLabel;
    }

    public void setToAccountLabel(JLabel toAccountLabel) {
        this.toAccountLabel = toAccountLabel;
    }

    public JTextField getToAccField() {
        return toAccField;
    }

    public void setToAccField(JTextField toAccField) {
        this.toAccField = toAccField;
    }

    public JLabel getAmountLabel() {
        return AmountLabel;
    }

    public void setAmountLabel(JLabel amountLabel) {
        AmountLabel = amountLabel;
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

    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JLabel toAccountLabel;
    private JTextField toAccField;
    private JLabel AmountLabel;
    private JTextField amountField;
    private JButton goButton;
}
