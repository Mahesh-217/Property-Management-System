public class InvPersonal extends Investor
{
    //public String invCode;
    public String invDOB;
    public String invAddress;
    public long invPhone;
    public long invAadhar;

    public InvPersonal(String invCode,String uname,String ipass,String name,float totalCapital,int activeScheme,float netProfit,String invDOB,String invAddress,long invPhone,long invAadhar)
    {
        //this.invCode=invCode;
        super(uname, ipass, invCode, name, totalCapital, activeScheme, netProfit);
        this.invDOB=invDOB;
        this.invAddress=invAddress;
        this.invAadhar=invAadhar;
        this.invPhone=invPhone;
    }
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Investor Code:"+invCode);
        System.out.println("Username:"+uname);
        System.out.println("Total Capital:"+totalCapital);
        System.out.println("Active Schemes:"+activeScheme);
        System.out.println("Net Profit:"+netProfit);
        System.out.println("Date of Birth:"+invDOB);
        System.out.println("Address:"+invAddress);
        System.out.println("Phone Number:"+invPhone);
        System.out.println("Aadhar Number:"+invAadhar);
    }
}