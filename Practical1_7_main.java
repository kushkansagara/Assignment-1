import java.util.Scanner;
public class Practical1_7_main
{
    public static void main(String[] args)
    {
        int row;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number one less than the number rows you want in Pyramid : ");
        row=sc.nextInt();
        Practical1_7 obj = new Practical1_7();
        obj.Pyramid(row);//calling method of class file.
    }
}
