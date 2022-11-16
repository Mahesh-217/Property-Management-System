public class Commodities
{
    public String schemeCode[];
    public String invCode;
    public String commType[];
    public float commBuyPrice[];
    public float commsellPrice[];
    public String buyDate[];
    public String srcCountry[];
    public String commTransStat[];
    
    public Commodities(String[] schemeCode, String invCode, String[] commType, float[] commBuyPrice, float[] commsellPrice, String[] buyDate, String[] srcCountry,String[] commTransStat)
    {
        this.schemeCode=schemeCode;
        this.invCode=invCode;
        this.commType=commType;
        this.commBuyPrice=commBuyPrice;
        this.commsellPrice=commsellPrice;
        this.buyDate=buyDate;
        this.srcCountry=srcCountry;
        this.commTransStat=commTransStat;
    }
}