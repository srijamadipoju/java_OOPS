class ATMDetails
{
    String card_type = "debit";
    private static int pin = 7575;
    int card_no = 123456;
    int amount = 89000;

    public void setPin(int newpin){
    this.pin=newpin;
    System.out.println("pin changed successfully");
}
public int getPin()
{
    return this.pin;
}
}
class ATM
{
    public static void main(String args[])
    {
        ATMDetails sbi = new ATMDetails();

        System.out.println(sbi.getPin());

        sbi.setPin(8900);

        System.out.println(sbi.getPin());
    }
}
