public class Admin
{
    public String adminCode;
    public String adminName;
    public String adminUname;
    private String adminPass;
    public int totalSchemes;
    public int totalApp;

    public Admin(String adminCode,String adminName,String adminUname,String adminPass,int totalSchemes,int totalApp)
    {
        this.adminCode=adminCode;
        this.adminName=adminName;
        this.adminUname=adminUname;
        this.adminPass=adminPass;
        this.totalSchemes=totalSchemes;
        this.totalApp=totalApp;
    }
    
    public String getadminPass()
    {
        return adminPass;
    }
}