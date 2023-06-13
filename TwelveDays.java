import java.util.Scanner;

public class TwelveDays
{
   public static void main(String args[]) 
   {
      int day = 1, count;
      
      for  (count = 12;count > 0; count--)
      {
         switch (day)
         {
         case 1:
         System.out.println("On the 1st day of Christmas my true love gave to me");
         break;
         case 2:
         System.out.println("On the 2nd day of Christmas my true love gave to me");
         break;
         case 3:
         System.out.println("On the 3rd day of Christmas my true love gave to me");
         break;
         default:
         System.out.println("On the " + day + "th day of Christmas my true love gave to me");      
         }
         
          day++;
          
          switch (count) 
          {
            case 1:
            System.out.println("Twelve drummers drumming,");
            case 2:
            System.out.println("Eleven pipers piping,");
            case 3:
            System.out.println("Ten lords a-leaping,");
            case 4:
            System.out.println("Nine ladies dancing,");
            case 5:
            System.out.println("Eight maids a-milking,");
            case 6:
            System.out.println("Seven swans a-swimming,");
            case 7:
            System.out.println("Six geese a-laying,");
            case 8:
            System.out.println("Five golden rings,");
            case 9:
            System.out.println("Four calling birds,");
            case 10:          
            System.out.println("Three french hens,");
            case 11:
            System.out.println("Two turtle doves, and");
            case 12:
            System.out.println("A partridge in a pear tree.");
            System.out.println(" ");         
          }
          
      }
      
   }

}