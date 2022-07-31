public class Practical1_3
{
    static boolean lastDigit(int a,int b)
    {
        if(a%10 == b%10)//check remainder of both number are same.
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
