import java.util.Scanner;
class Year{
 public static void main(String args[]){
  int year;
  Scanner S = new Scanner(System.in);
  System.out.print("Enter the year to check weather it is a leap or not:....");
  year = S.nextInt();

  if(year%4 == 0)
  {
   if(year%100 == 0)
    {
      if(year%400 == 0)
      { 
        System.out.println("It is a leap year.");  
      }
      else
      {
        System.out.print("It is not a leap year.");
      }
    }
   else
    { 
        System.out.println("It is a leap year.");  
    }
  }
 else
  {
     System.out.print("It is not a leap year.");
  }
 }
}
