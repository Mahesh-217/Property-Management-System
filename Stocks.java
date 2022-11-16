public class Stocks
{
    public String schemeCode[];
    public String invCode;
    public int totalShares[];
    public int invShares[];
    public float shareVal[];
    public float shareTrend[];
    public float shareIPO[];

    public Stocks(String[] schemeCode, String invCode, int[] totalShares, int[] invShares, float[] shareVal, float[] shareTrend, float[] shareIPO)
    {
        this.schemeCode=schemeCode;
        this.invCode=invCode;
        this.totalShares=totalShares;
        this.invShares=invShares;
        this.shareVal=shareVal;
        this.shareTrend=shareTrend;
        this.shareIPO=shareIPO;
    }
    
}