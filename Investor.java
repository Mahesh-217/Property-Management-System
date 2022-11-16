class Investor
{
    public String uname;
    private String ipass;
    public String invCode;
    public String name;
    public float totalCapital;
    public int activeScheme;
    public float netProfit;

    public Investor(String uname,String ipass,String invCode,String name,float totalCapital,int activeScheme,float netProfit)
    {
        this.uname=uname;
        this.ipass=ipass;
        this.invCode=invCode;
        this.name=name;
        this.totalCapital=totalCapital;
        this.activeScheme=activeScheme;
        this.netProfit=netProfit;
    }
    public String getipass()
    {
        return ipass;
    }
    /*public int findUname(String x)
    {
        int n = uname.length;
        for (int i = 0; i < n; i++)
        {
            if (uname == x)
                return i;
        }
        return -1;
    }
    public boolean isValid(String y,int ind)
    {
        if(y==pass)
        {
            return true;
        }
        return false;
    }/*
    public String getipass()
    {
        return ipas;
    }*/
}