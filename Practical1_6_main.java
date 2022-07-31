import java.util.Scanner;
public class Practical1_6_main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int a = sc.nextInt();
        String[] b = new String[a];
        System.out.print("Enter Array element : ");
        for (int i = 0; i < a; i++) {
            b[i] = sc.next();
        }
        System.out.print("Enter string you want to remove : ");
        String c = sc.next();
        Practical1_6 obj = new Practical1_6();
        obj.wordWithout(b, c);//calling method of class file.
    }
}
