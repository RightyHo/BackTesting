import java.io.File;
import java.time.ZonedDateTime;

/**
 * Created by andrewho on 02/11/14.
 */
public class MarketMonitorImpl {
    private double open;                //open price of the market data snapshot being processed
    private double close;               //closing price of the market data snapshot being processed
    private double high;                //high price of the market data snapshot being processed
    private double low;                 //low price of the market data snapshot being processed
    private ZonedDateTime timeStamp;    //time stamp of the market data snapshot being processed
    private File marketDataFile;        //historic market price data file
    //returns true if the safetyCatchLevel threshold has not been reached yet since the reference period ended
    private boolean safetyCatchOn;      //trade search active Vs wait if the safety catch is on
}
