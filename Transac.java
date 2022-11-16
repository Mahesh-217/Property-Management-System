public class Transac
{
    public String investCode;
    public String transID;
    public String transTime;
    public String transDate;
    public float transAmt;
    public String transStat;
 
    public Transac(String investCode, String transID, String transTime, String transDate, float transAmt, String transStat)
    {
        this.investCode=investCode;
        this.transID=transID;
        this.transTime=transTime;
        this.transDate=transDate;
        this.transAmt=transAmt;
        this.transStat=transStat;
    }
    
    public void displaytransac()
    {	System.out.println("Investment Code:"+investCode);
    	System.out.println("Transaction ID:"+transID);
        System.out.println("Transaction Time:"+transTime);
        System.out.println("Transaction Date:"+transDate);
        System.out.println("Transaction Amount:"+transAmt);
        System.out.println("Transaction Status:"+transStat);
        System.out.println("");
    }
    
}