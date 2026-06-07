class Electronics
{
    public void turnon()
    {
        System.out.println("Devices have turned on.....");
    }
}

class SmartPhone extends Electronics
{
    public void takeselfie(){
        System.out.println("Wow its nice pic :");
    }
}
class SingleInheritanceExample
{
    public static void main(String args[])
    {
        SmartPhone sp = new SmartPhone();
        sp.takeselfie();
        sp.turnon();
    }
}