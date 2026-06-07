abstract class Bank
{
    abstract public void loan(float perc); //abstract method

    public void netbanking()  //non-abstact method
    {  
       System.out.println("Yes netbanking Service is Availible");
    }

} 
class HDFC extends Bank
{
    public void loan(float perc)
    {
        System.out.println("HDFC gives " +perc+  "ROI");
    }
}
class SBI extends Bank
{
    public void loan(float perc)
    {
        System.out.println("SBI gives " +perc+  "ROI");
    }
}

class Bank1
{
    public static void main(String args[])
    {
        HDFC h = new HDFC();
        h.loan(8.99f);
        SBI s = new SBI();
        s.loan(6.44f);
        s.netbanking();
    }
}