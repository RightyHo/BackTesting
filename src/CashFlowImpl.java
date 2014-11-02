import java.util.List;

/**
 * Created by andrewho on 02/11/14.
 */
public class CashFlowImpl {
    private List<Trade> activeTradeList;    //list of trades that are currently open
    private List<Trade> closedTradeList;    //list of trades that are currently closed
    private double totalRealisedPandL;      //total profit or loss from all closed trades
    private double totalUnrealisedPandL;    //total profit or loss from all trades that are currently open
    private double largestDrawDown;         //largest total of consecutive losses in trade history
    private double largestProfitableRun;    //largest total of consecutive profits in trade history
    private double largestProfitableTrade;  //largest single winning trade
    private double largestLossOnATrade;     //largest single losing trade
    private double todaysTotalPandL;        //todays net profit or loss including both realised and unrealised p&l
}
