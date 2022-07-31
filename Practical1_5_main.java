import java.util.Scanner;
public class Practical1_5_main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First String : ");
        String a=sc.nextLine();
        System.out.print("Enter Second String : ");
        String b=sc.nextLine();
        Practical1_5 obj = new Practical1_5();
        int c=obj.stringMatch(a, b);//calling method of class file.
        System.out.println(c);
    }
}
