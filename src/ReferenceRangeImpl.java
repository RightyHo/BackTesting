import java.time.ZonedDateTime;

/**
 * Created by andrewho on 02/11/14.
 */
public class ReferenceRangeImpl {
    private String currencyPair;                //name of instrument traded eg; GBP/USD
    private int referencePeriodLength;          //number of hours in the reference period eg; 8 hours
    private ZonedDateTime refPeriodStartAnchor; //start time that the reference period is measured from
    private double refHigh;                     //high price traded during the reference period
    private double refLow;                      //low price traded during the reference period
    private double refOpen;                     //opening price of the reference period
    private double refClose;                    //closing price of the reference period
    private double refPriceRange;               //price range traded during reference period, high - low
}
