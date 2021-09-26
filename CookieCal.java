/*
Anthony Sarim
U00176480
Determine and print the amount of calories consumed based on number of cookies consumed.
*/
import java.util.Scanner;
public class CookieCal{
   public static void main(String [] args){
   Scanner in=new Scanner(System.in);
   System.out.print("Enter the number of cookies eaten: ");
   int cat=in.nextInt();
   if(cat>40)System.out.print("There aren't that many cookies!");
   else System.out.print("Number of total calories consumed: "+cat*75);



}
}