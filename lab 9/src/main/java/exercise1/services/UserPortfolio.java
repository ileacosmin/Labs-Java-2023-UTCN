/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1.services;

import jdk.internal.icu.impl.Trie2;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.swing.table.AbstractTableModel;
import java.math.BigDecimal;
import java.util.Map;

/**
 * Uses Lombok to get rid of boilerplate code.
 *
 * @author mihai.hulea
 * @author radu.miron
 */
@Data // it creates getters, setters, equals(), hashCode() and toString() (at compile time)
@AllArgsConstructor // it creates the constructor with arguments for all the attributes (at compile time)
public class UserPortfolio  extends AbstractTableModel{
    private BigDecimal cash;
    private Map<String, Integer> shares; // a map of number of shares by stock symbol

    @Override
    public int getRowCount() {
        return shares.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Trie2 items;
        StockItem i = items.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return i.getName();
            case 1:
                return i.getSymbol();
            case 2:
                if (i.getPrice() != null) return i.getPrice().toPlainString();
                else return "N/A";
            case 3:
                return i.getCurrency();
            case 4:
                return i.getChange().toPlainString() + "%";
            case 5:
                return i.getExchange();
        }
        return "N/A";
    }

    @Override
    public String getColumnName(int index) {
        return columns[index];
    }
}
