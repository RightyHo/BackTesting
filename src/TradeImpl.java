/**
 * Created by andrewho on 02/11/14.
 */
public class TradeImpl {
    private int tradeId;            //trade ID
    private boolean tradeOpen;      //trade status
    private double entryPrice;      //trade entry price
    private boolean buyTrade;       //trade direction -> sell trade if false
    private double stopLoss;        //stop loss for this position
    private double takeProfit;      //take profit for this position
    private double marketPrice;     //current price of the instrument that is being traded
    private double markToMarket;    //current profitability of the trade
}
