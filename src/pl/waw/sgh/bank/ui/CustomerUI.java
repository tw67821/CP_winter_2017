package pl.waw.sgh.bank.ui;

import pl.waw.sgh.bank.Bank;
import pl.waw.sgh.bank.Customer;
import pl.waw.sgh.bank.exceptions.BankException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.*;

public class CustomerUI {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JLabel ID_label;
    private JTextField textField_ID;
    private JTextField textField_First;
    private JTextField textField_Last;
    private JTextField textField_Email;
    private JButton previousButton;
    private JButton newButton;
    private JButton nextButton;
    private JButton saveButton;

        private Bank bank = new Bank();
        private Customer curCustomer;

    public void setCustomer(Customer customer) {
        curCustomer = customer;
        textField_ID.setText(customer.getCustomer_ID().toString());
        textField_First.setText(customer.getFirst_name());
        textField_Last.setText(customer.getLast_name());
        textField_Email.setText(customer.getEmail());
    }



        public static void main(String[] args) {
            JFrame Frame1=new JFrame("Customer UI");
            CustomerUI CustomerUI=new CustomerUI();
            Frame1.add(CustomerUI.panel1);
            Frame1.setSize(700 ,300);
            Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Frame1.setVisible(true);
        }



        public CustomerUI(){
            nextButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    int currentCustomerIndex = bank.getCustomer_list().indexOf(curCustomer);
                    if (currentCustomerIndex < bank.getCustomer_list().size() - 1) {
                        Customer nextCustomer = bank.getCustomer_list().get(currentCustomerIndex + 1);
                        setCustomer(nextCustomer);
                    }




                                             }
                                         }
            );
            previousButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    int currentCustomerIndex = bank.getCustomer_list().indexOf(curCustomer);
                    if (currentCustomerIndex > 0) {
                        Customer nextCustomer = bank.getCustomer_list().get(currentCustomerIndex - 1);
                        setCustomer(nextCustomer);
                    }
                }
            });
            //creating new customers (because there are not any customers specified)
            newButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    Customer newCustomer = bank.CreateCustomer(
                            textField_First.getText(),
                            textField_Last.getText(),
                            textField_Email.getText());
                    curCustomer = newCustomer;

                }
            });
            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        Integer custId = Integer.valueOf(textField_ID.getText());
                        Customer customer = bank.FindCustomerByID(custId);
                        customer.setFirst_name(textField_First.getText());
                        customer.setLast_name(textField_Last.getText());
                        customer.setEmail(textField_Email.getText());
                    } catch (BankException be) {
                        JOptionPane.showMessageDialog(null, be.getMessage());
                    }
                }
            });
        }





    }


