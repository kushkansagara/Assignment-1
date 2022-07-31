import java.util.Scanner;
public class Practical1_2_main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String a=sc.nextLine();
        Practical1_2 obj = new Practical1_2();
        obj.startOz(a);//calling method of class file.
    }
}
