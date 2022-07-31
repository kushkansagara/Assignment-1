import java.util.Scanner;
public class Practical1_3_main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a= sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b=sc.nextInt();
        Practical1_3 obj = new Practical1_3();
        boolean c=obj.lastDigit(a,b);//calling method of class file.
        System.out.println(c);
    }
}
