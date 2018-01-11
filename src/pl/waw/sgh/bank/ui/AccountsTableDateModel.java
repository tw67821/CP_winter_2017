package pl.waw.sgh.bank.ui;


import pl.waw.sgh.bank.Account;

import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

/**
 * Created by prubac on 5/24/2017.
 */
public class AccountsTableDataModel extends DefaultTableModel {

    static String[] cols = {"ID", "Type", "Currency", "Balance"};

    List<Account> dataList = new ArrayList<>();

    public AccountsTableDataModel(List<Account> accountList) {
        super(cols, 0);
        addRows(accountList);
    }

    public void addRows(List<Account> accountList) {
        for (Account acc : accountList) {
            addRow(acc);
        }
    }

    public void addRow(Account acc) {
        dataList.add(acc);
        fireTableDataChanged();
    }

    public void removeAllRows() {
        dataList.clear();
        fireTableDataChanged();
    }

    public void removeRow(int rowIndex) {
        dataList.remove(rowIndex);
        fireTableDataChanged();
    }

    @Override
    public Class getColumnClass(int colIndex) {
        switch (colIndex) {
            case 0:
                return Long.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return BigDecimal.class;
            default:
                return Object.class;
        }
    }

    @Override
    public Object getValueAt(int rowInd, int colInd) {
        Account acc = (Account) dataList.get(rowInd);
        switch (colInd) {
            case 0:
                return acc.getAccountID();
            case 1:
                return acc.getClass().getSimpleName().
                        replace("Account", "");
            case 2:
                return acc.getCurrency();
            case 3:
                return acc.getBalance();
            default:
                return new Object();
        }
    }

    @Override
    public void setValueAt(Object newVal, int row, int column) {
        Account account = (Account) dataList.get(row);
        switch (column) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                account.setCurrency((String) newVal);
                return;
            case 3:
                account.setBalance((BigDecimal) newVal);
        }

    }
}