import java.util.Scanner;

public class Main
{
    
  static void strSearch(String strArray[], String item)
  {
      int i =0;
      int flag =0;
      for(i=0;i<8;i++){
          if (item.equals(strArray[i]))
          {
              flag = 1;
              break;
          }
      }
      if(flag == 1)
      System.out.println("item found at position " + ( i + 1));
      else
      System.out.println("item not found");
  }
  
  
  static void intSearch(int strArray[], int item)
  {
      int i =0;
      int flag =0;
      for(i=0;i<8;i++){
          if (item == strArray[i])
          {
              flag = 1;
              break;
          }
      }
      if(flag == 1)
      System.out.println("item found at position " + ( i + 1));
      else
      System.out.println("item not found");
  }
  
  
   public static void main(String args[])
   {
       Scanner scan = new Scanner(System.in);
       
       String[] myClientsArray = new String[8];
       /* array starts with 0 so it is 0 -7 */
       String item;
       int item1;
       
       myClientsArray[0] = "Butler";
       myClientsArray[1] = "Samuels";
       myClientsArray[2] = "Bond";
       myClientsArray[3] = "Chang";
       myClientsArray[4] = "Baker";
       myClientsArray[5] = "Davis";
       myClientsArray[6] = "Zeng";
       myClientsArray[7] = "Joe";
      
       int[] myClientNumbers = new int[8];
       
       myClientNumbers[0] = 108;
       myClientNumbers[1] = 121;
       myClientNumbers[2] = 188;
       myClientNumbers[3] = 107;
       myClientNumbers[4] = 122;
       myClientNumbers[5] = 111;
       myClientNumbers[6] = 203;
       myClientNumbers[7] = 135;

       System.out.println("__________ Linear Search for myClientsArray ______________");
       System.out.println("Enter a Client Name...");
       item = scan.next();
       
       Main user=new Main();
       user.strSearch(myClientsArray,item);
       System.out.println("\n__________ Linear Search myClientNumbers ______________");
       System.out.println("Enter a Client Number...");
       item1 = scan.nextInt();
       user.intSearch(myClientNumbers, item1);
   }
}