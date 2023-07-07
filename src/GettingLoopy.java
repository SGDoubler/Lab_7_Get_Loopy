
public class GettingLoopy {
    public static void main(String[] args)
    {
        System.out.println("Counting up from 0 to 30");
        for(int cnt=0; cnt < 31; cnt++)
        {
            System.out.println(cnt);
        }
        System.out.println("Counting down from 30 to 0");
        for(int cnt=30; cnt > -1; cnt--)
        {
            System.out.println(cnt);
        }
        System.out.println("Counting up by 3 from 0 to 18");
        for (int cnt=0; cnt < 19; cnt = cnt + 3)
        {
            System.out.println(cnt);
        }
        System.out.println("Counting down by 2 from 10 to 0");
        for (int cnt=10; cnt > -1; cnt = cnt -2)
        {
            System.out.println(cnt);
        }
        System.out.println("Printing * 1 to 5");
        for (int row = 0; row <= 5; row++)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Printing * 5 to 1");
        for (int row = 5; row >= 1; row--)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Printing * 5 X 5");
        for (int row = 1; row <= 5; row++)
        {
            for (int col = 1; col <= 5; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Printing the letter S out of *");
        for (int row = 1; row <= 2; row++)
        {
            for (int col = 1; col <= 15; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = 1; row <= 3; row++)
        {
            for(int col = 1; col <= 1; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row <= 2; row++)
        {
            for (int col = 1; col <= 15; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = 1; row <=3; row++)
        {
            System.out.print(" ");
            for (int col = 1; col <= 13; col++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int row = 1; row <= 2; row++)
        {
            for (int col = 1; col <= 15; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}