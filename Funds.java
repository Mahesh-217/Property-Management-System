public class Funds
{
    public String investCode[];
    public String schemeCode[];
    public String invCode;
    public float allocFunds[];
    public String appStatus[];
    public float fundsProfitLoss[];
 
    public Funds(String[] investCode, String[] schemeCode, String invCode, float[] allocFunds, String[] appStatus, float[] fundsProfitLoss)
    {
        this.investCode=investCode;
        this.schemeCode=schemeCode;
        this.invCode=invCode;
        this.allocFunds=allocFunds;
        this.appStatus=appStatus;
        this.fundsProfitLoss=fundsProfitLoss;

    }
    
    public void displayfunds()
    {	int k;
    	
    	System.out.println("-----------------------");
    	System.out.println("Investor Code:"+invCode);
    	System.out.println("-----------------------");

    	for(k=0; k<investCode.length;k++)
    	{
        System.out.println("Investment Code:"+investCode[k]);
        System.out.println("Scheme Code:"+schemeCode[k]);
        System.out.println("Allocated Funds:"+allocFunds[k]);
        System.out.println("Approval Status:"+appStatus[k]);
        System.out.println("Profit/Loss Ratio:"+fundsProfitLoss[k]);
    	System.out.println("-----------------------");
    	}
    	
    }
    
}