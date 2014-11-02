/**
 * Created by andrewho on 02/11/14.
 */
public class TradingStrategyImpl {
    //retracement percentage threshold the price must pull back from the high or low
    //before the safety catch is removed and the system will allow new trades to be triggered
    private int safetyCatchRetracementPercent;
    //price level calculated from reference period high & low and safety catch retracement percent
    private double safetyCatchLevel;
    private int executionTriggerThreshold;  //percentage of refPriceRange to use for execution trigger calculation eg; 105%
    private double buyTrigger;              //buy price level = refLow + refPriceRange * executionTriggerThreshold
    private double sellTrigger;             //sell price level = refHigh - refPriceRange * executionTriggerThreshold
    private int stopLossThreshold;          //size of stop loss as a percentage of the refPriceRange eg; 55%
    private int takeProfitThreshold;        //size of take profit as a percentage of the refPriceRange eg; 110%
    private double longStopLossLevel;       //sell price stop limit = buyTrigger - refPriceRange * stopLossThreshold
    private double longTakeProfitLevel;     //sell price profit level = buyTrigger + refPriceRange * takeProfitThreshold
    private double shortStopLossLevel;      //buy price stop limit = sellTrigger + refPriceRange * stopLossThreshold
    private double shortTakeProfitLevel;    //buy price profit level = sellTrigger - refPriceRange * takeProfitThreshold
    private int tradeUnitSize;              //size of trade eg; £100,000
    private double riskPerPip;              //amount of money the trade risks per pip movement eg; $10
    private double dailyLossLimit;          //limit denoting the largest acceptable daily loss amount eg; $1,000
    private int minsPerDataUpdate;          //number of minutes between market data snapshot updates eg; 1 minute
}
