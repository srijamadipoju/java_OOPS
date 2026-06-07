class GetAscci
{
    public static void main(String args[])
    {
        String sc = "Srija";
        int len = sc.length();
        char[] ch = sc.toCharArray();
        
        for(char c:ch){
            System.out.println(c+"->"+(c-96));
        }
    }
}