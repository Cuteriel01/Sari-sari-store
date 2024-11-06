
package lab5;
import java.util.Scanner;       
public class Lab5 {
   public static void main(String[] args) {


       Scanner scan = new Scanner (System.in);
       
       
       
       System.out.println("Enter Product name: ");
       String pname = scan.nextLine();
       System.out.println("Enter the product code: ");
       Scanner code = new Scanner (System.in);
       long c = code.nextLong();
       System.out.println("Enter the quantity in stock: ");
       Scanner quantity = new Scanner (System.in);
       long q = quantity.nextLong();
       System.out.println("Enter the product price per unit: ");
       Scanner price = new Scanner (System.in);
       int p = price.nextInt();
       System.out.println("Enter the supplier name: ");
       Scanner sname = new Scanner (System.in);
       String s = sname.nextLine();
       System.out.println("Enter the expiration date: ");
       Scanner date = new Scanner (System.in);
       int d = date.nextInt();
       System.out.println("Enter the number of product sold today: ");
       Scanner pst = new Scanner (System.in);
       int p1 = pst.nextInt();
       System.out.println("Enter the discount percentage: ");
       Scanner dp = new Scanner (System.in);
       int d1 = dp.nextInt();
       System.out.println("Enter the reorder threshold quantity: ");
       Scanner reoder = new Scanner (System.in);
       int r = reoder.nextInt();
       System.out.println("Enter the store location: ");
       Scanner location = new Scanner (System.in);
       String l = location.nextLine();
       
       System.out.println("Enter Product name: " + pname);
       System.out.println("Enter the product code: " + c);
       System.out.println("Enter the quantity in stock: " + q);
       System.out.println("Enter the product price per unit: " + p);
       System.out.println("Enter the supplier name: " + sname);
       System.out.println("Enter the expiration date: " + d);
       System.out.println("Enter the number of product sold today: " + pst);
       System.out.println("Enter the discount percentage: " + d1);
       System.out.println("Enter the reorder threshold quantity: " + reoder);
       System.out.println("Enter the store location: " + l);
       
       
       
       
       
       
       
       
        }
}
