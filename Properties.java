public class Properties
{
    public String schemeCode[];
    public String invCode;
    public float propBuyPrice[];
    public float propSellPrice[];
    public float propValGrow[];
    public String propType[];
    
    public Properties(String[] schemeCode, String invCode, float[] propBuyPrice, float[] propSellPrice, float[] propValGrow, String[] propType)
    {
        this.schemeCode=schemeCode;
        this.invCode=invCode;
        this.propBuyPrice=propBuyPrice;
        this.propSellPrice=propSellPrice;
        this.propValGrow=propValGrow;
        this.propType=propType;
    }
    
}