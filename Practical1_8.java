public class Practical1_8
{
    Practical1_8(int stu,int que,String[] ans,String key)
    {
        int marks[] =new int[stu];
        char[] c=key.toCharArray();//gives the key to a new string.
        for(int i=0;i<stu;i++)//moves until que of all student be checked.
        {
            marks[i]=0;
            char[] c2 = ans[i].toCharArray();//gives the ans given by student to a new string.
            for(int j=0;j<que;j++) 
            {
                if(c2[j]==c[j])//compares the key and the ans of the student and increases the marks
                {
                    marks[i]++;
                }
            }
        }
        for(int i=0;i<stu;i++)
        {
            System.out.println("Marks Scored by stident "+(i+1)+" :"+marks[i]);
        }
    }
}

