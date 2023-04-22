import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter base: ");
    int base = in.nextInt();
    for (int i = 0;
        i<=base;
        i++)
        {
          for (int e =0; e<=(base-i); e++)
          {
            System.out.println("*");
          }
          System.out.println("");
        }
    

  }
}
