public class Practical1_6 {
    static void wordWithout(String x[], String y)
    {
        int n = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals(y))//check string array is same as y. 
            {
                n++;
            }
        }
        String[] d = new String[x.length - n];
        int m = 0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i].equals(y))
            {

            }
            else
            {
                d[m]=x[i];//string element not equal to y are placed in new array.
                m++;
            }
        }
        System.out.println("New Array is : ");
        for(String element:d)
        {
            System.out.println(element);
        }
    }
}


