public class Practical1_7 {
    static  void Pyramid(int row)
    {
        int num = 0;
        for (int i = 0; i <=row; i++)
        {
            for (int j = 1; j <= row - i; j++) {
                System.out.printf("%4s", " ");//putting blank space until total rows-desired 
            }
            for (int j = 0; j <= i; j++) {
                num = (int) Math.pow(2, j);
                System.out.printf("%4d", num);//after that prints power of the 2 in the row as per the row.
            }
            for (int j = i - 1; j >= 0; j--) {
                num = (int) Math.pow(2, j);
                System.out.printf("%4d", num);//prints the pow of 2 after the revorsed right angle triangle from above is printed to make it a proper pyramid
            }
            System.out.println();
        }
    }
}

