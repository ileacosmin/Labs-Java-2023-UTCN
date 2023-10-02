package exercise1.ui;

import javax.swing.*;

/**
 *  todo: implement portfolio panel; for each owned stock add symbol, quantity, price per unit, total price of the position
 *  it should look similar to the 'Market' panel
 */
public class PortofolioJPanel extends JPanel {

    private StockMarketJFrame frame;

    public PortofolioJPanel(StockMarketJFrame frame){
        this.frame = frame;
        initComponent();
    }

    private void initComponent() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        String[] column={"Symbol","Quantity","Price per unit","Total price"};
        String[][] data = new String[4][4];
        for(int i = 0; i < frame.getPortfolio().getShares().size(); i ++){
            data[i][0] = String.valueOf(frame.getPortfolio().getShares().get(i));
        }
        JTable jTablePortofolio = new JTable(data,column);
        JScrollPane marketScrollablePane = new JScrollPane(jTablePortofolio);

        add(marketScrollablePane);

    }


}
