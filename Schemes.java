public class Schemes implements inter
{
    public String schemeCode;
    public String schemeName;
    public String assetClass;
    public float totalFunds;
    public int activeInv;
    public String schemeProv;
    public String adminCode;
    
    public int totalShares; //Stocks
    public float shareVal;
    public float shareTrend;
    public float shareIPO;
    
    public String commType; //Commodities
    public float commBuyPrice;
    public String srcCountry;
    
    public float interestRate; // Bonds
    public String matDate;
    
    public float propBuyPrice;//Properties
  
    
    public Schemes(String schemeCode, String schemeName, String assetClass, float totalFunds, int activeInv, String schemeProv, String adminCode,int totalShares,float shareVal,float shareTrend,float shareIPO)
    {
        this.schemeCode=schemeCode;
        this.schemeName=schemeName;
        this.assetClass=assetClass;
        this.totalFunds=totalFunds;
        this.activeInv=activeInv;
        this.schemeProv=schemeProv;
        this.adminCode=adminCode;
        this.totalShares=totalShares;
        this.shareVal=shareVal;
        this.shareTrend=shareTrend;
        this.shareIPO=shareIPO;
    }
    @Override
    public void displaystock()
    {	
        System.out.println("Scheme Code:"+schemeCode);
    	System.out.println("Scheme Name:"+schemeName);
        System.out.println("Asset Class:"+assetClass);
        System.out.println("Total Funds:"+totalFunds);
        System.out.println("Active Investors:"+activeInv);
        System.out.println("Scheme Provider:"+schemeProv);
        System.out.println("Admin Code:"+adminCode);
        System.out.println("Total Shares:"+totalShares);
        System.out.println("Share Valuation:"+shareVal);
        System.out.println("Share Growth Trend:"+shareTrend);
        System.out.println("Share IPO:"+shareIPO);
    }
    
    public Schemes(String schemeCode, String schemeName, String assetClass, float totalFunds, int activeInv, String schemeProv, String adminCode, String commType, float commBuyPrice, String srcCountry)
    {
        this.schemeCode=schemeCode;
        this.schemeName=schemeName;
        this.assetClass=assetClass;
        this.totalFunds=totalFunds;
        this.activeInv=activeInv;
        this.schemeProv=schemeProv;
        this.adminCode=adminCode;
        this.commType=commType;
        this.commBuyPrice=commBuyPrice;
        this.srcCountry=srcCountry;
    }
    
    public void displaycomm()
    {
    	System.out.println("Scheme Code:"+schemeCode);
    	System.out.println("Scheme Name:"+schemeName);
        System.out.println("Asset Class:"+assetClass);
        System.out.println("Total Funds:"+totalFunds);
        System.out.println("Active Investors:"+activeInv);
        System.out.println("Scheme Provider:"+schemeProv);
        System.out.println("Admin Code:"+adminCode);
        System.out.println("Commodity Type:"+commType);
        System.out.println("Buy Price:"+commBuyPrice);
        System.out.println("Source Country:"+srcCountry);
    }
    
    public Schemes(String schemeCode, String schemeName, String assetClass, float totalFunds, int activeInv, String schemeProv, String adminCode, float interestRate, String matDate)
    {
        this.schemeCode=schemeCode;
        this.schemeName=schemeName;
        this.assetClass=assetClass;
        this.totalFunds=totalFunds;
        this.activeInv=activeInv;
        this.schemeProv=schemeProv;
        this.adminCode=adminCode;
        this.interestRate=interestRate;
        this.matDate=matDate;
    }
    
    public void displaybonds()
    {	System.out.println("Scheme Code:"+schemeCode);
    	System.out.println("Scheme Name:"+schemeName);
        System.out.println("Asset Class:"+assetClass);
        System.out.println("Total Funds:"+totalFunds);
        System.out.println("Active Investors:"+activeInv);
        System.out.println("Scheme Provider:"+schemeProv);
        System.out.println("Admin Code:"+adminCode);
        System.out.println("Interest Rate:"+interestRate);
        System.out.println("Maturity Date:"+matDate);
    }
    
    public Schemes(String schemeCode, String schemeName, String assetClass, float totalFunds, int activeInv, String schemeProv, String adminCode, float propBuyPrice)
    {
        this.schemeCode=schemeCode;
        this.schemeName=schemeName;
        this.assetClass=assetClass;
        this.totalFunds=totalFunds;
        this.activeInv=activeInv;
        this.schemeProv=schemeProv;
        this.adminCode=adminCode;
        this.propBuyPrice=propBuyPrice;
    }
    
    public void displayprop()
    {
    	System.out.println("Scheme Code:"+schemeCode);
    	System.out.println("Scheme Name:"+schemeName);
        System.out.println("Asset Class:"+assetClass);
        System.out.println("Total Funds:"+totalFunds);
        System.out.println("Active Investors:"+activeInv);
        System.out.println("Scheme Provider:"+schemeProv);
        System.out.println("Admin Code:"+adminCode);
        System.out.println("Property Buy Price:"+propBuyPrice);
    }
    
    public void displayonlyschemes()
    {
        //System.out.println("Scheme Code\t\t\tScheme Name");
    	System.out.println(schemeCode+"\t\t\t\t"+schemeName+"\t\t\t\t");
    }
    
}