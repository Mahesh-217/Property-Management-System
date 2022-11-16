public class Bonds
{
    public String schemeCode[];
    public String invCode;
    public float interestRate[];
    public int totalMonths[];
    public String matDate[];
    public String initialLendingDate[];
    
    public Bonds(String[] schemeCode, String invCode, float[] interestRate, int[] totalMonths, String[] matDate, String[] initialLendingDate)
    {
        this.schemeCode=schemeCode;
        this.invCode=invCode;
        this.interestRate=interestRate;
        this.totalMonths=totalMonths;
        this.matDate=matDate;
        this.initialLendingDate=initialLendingDate;
    }
}