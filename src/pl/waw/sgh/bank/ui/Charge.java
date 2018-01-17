package pl.waw.sgh.bank.ui;

import javax.swing.*;

public class Charge {
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;

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
    private JLabel amountLabel;
    private JTextField amountField;
    private JButton goButton;
}
