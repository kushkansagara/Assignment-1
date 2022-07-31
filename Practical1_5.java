public class Practical1_5
{
    static int stringMatch(String a,String b)
    {
        int n=0;
        int k =Math.min(a.length(),b.length());//Find witch string is shorter.
        for(int j=0;j<k-1;j++)
        {
            if(a.substring(j,j+2).equals(b.substring(j,j+2)))//substring of both string are equal or not.
            {
                n++;
            }
        }
        return n;
    }
}
