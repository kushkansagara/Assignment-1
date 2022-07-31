import java.util.Scanner;
public class Practical1_8_main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Student : ");
        int stu=sc.nextInt();
        System.out.print("Enter Number of Question : ");
        int que = sc.nextInt();
        String[] ans = new String[stu];
        System.out.println("Enter Answer given by Student : ");
        for(int i=0;i<stu;i++)
        {
            System.out.print("Student "+(i+1)+" : ");
            ans[i]= sc.next();
        }
        String key;
        System.out.print("Enter the Key : ");
        key= sc.next();
        Practical1_8 obj= new Practical1_8(stu,que,ans,key);//calls the constructor of class file.
    }
}
