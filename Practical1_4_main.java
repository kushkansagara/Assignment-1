import java.util.Scanner;
public class Practical1_4_main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int x=sc.nextInt();
        System.out.print("Enter Array : ");
        int a[]=new int[x];
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        Practical1_4 obj = new Practical1_4();
        boolean c=obj.array123(a);//calling method of class file.
        System.out.println(c);
    }
}
