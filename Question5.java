import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.modelmbean.ModelMBean;
import javax.naming.event.NamingExceptionEvent;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    int number = in.nextInt();
    int h=0;
    int mode=0;
    for (int i=0; i< number; i++)
    {
      int nextInt =in.nextInt();
      list.add(nextInt);
    }
    for (int i=0; i< list.size(); i++)
    {
      int count=0;
      for (int e=i; e<list.size(); e++ )
      {
        if (list.get(i)==list.get(e))
        {
          count+=1;
        }
      }
      if(count>h)
      {
        h=count;
        mode=list.get(i);
      }
    }
    System.out.println(mode);
    



    
  }
}
