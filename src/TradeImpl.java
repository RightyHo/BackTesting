/**
 * Created by andrewho on 02/11/14.
 */
public class TradeImpl {
    private int tradeId;            //trade ID
    private boolean tradeOpen;      //trade status
    private double triggerPrice;    //level at which the order was triggered and sent to market
    private double entrySlippage;   //difference between order trigger price and eventual trade entry price due to latency/spread/market movement
    private double entryPrice;      //trade entry price
    private boolean buyTrade;       //trade direction -> sell trade if false
    private double stopLoss;        //stop loss for this position
    private double takeProfit;      //take profit for this position
    private double marketPrice;     //current price of the instrument that is being traded
    private double markToMarket;    //current profitability of the trade...final profitablity of the trade if tradeopen = false
    private double exitPrice;       //trade exit price
    private double exitSlippage;    //difference between order trigger price and eventual trade exit price due to latency/spread/market movement
}
