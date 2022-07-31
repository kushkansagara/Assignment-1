import java.util.Scanner;
public class Practical1_10_main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.println("Enter Message");
        s1 = sc.nextLine();
        Practical1_10 obj = new Practical1_10();
        obj.Caesar_Cipher(s1);//calls the constructor of class file.
    }
}
