package com.vikrantkumar158.behavioural;


interface OfficeNetAccess
{
    void grantNetAccess();
}

class RealNetAccess implements OfficeNetAccess
{
    private String eName;
    public RealNetAccess(String empName)
    {
        this.eName = empName;
    }
    @Override
    public void grantNetAccess()
    {
        System.out.println("Access granted to the employee " + eName);
    }
}

class ProxyNetAccess implements OfficeNetAccess
{
    private String eName;
    public ProxyNetAccess(String eName)
    {
        this.eName = eName;
    }
    public int getRole(String empName)
    {
        return empName.length();
    }
    @Override
    public void grantNetAccess()
    {
        if(getRole(eName) > 4)
        {
            RealNetAccess realNetAccess = new RealNetAccess(eName);
            realNetAccess.grantNetAccess();
        }
        else
            System.out.println("Access not granted. Your job level is below 5...");
    }
}

public class proxy
{
    public static void main(String[] args)
    {
        OfficeNetAccess officeNetAccess = new ProxyNetAccess("Anil");
        officeNetAccess.grantNetAccess();
    }
}