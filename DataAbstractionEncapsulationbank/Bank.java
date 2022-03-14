package DataAbstractionEncapsulationbank;
import java.util.*;
import java.io.*;
public class Bank {
 int balance=4000,amt,n, id;
 Scanner sc=new Scanner(System.in);
 String s1=new String();
   Bank()
   {    
	  System.out.println("Enter the name of the person:");
     s1=sc.nextLine();
     System.out.println("Enter the person ID:");
     id=sc.nextInt();
    }
 public void deposit()
 {    System.out.println("Enter amount to be diposited:");
     amt=sc.nextInt();
     balance=balance+amt;
 }
 protected void draw()
 {
	 if(balance>500)
     {    System.out.println("Enter the amount to be draw:");
         n=sc.nextInt();
         if(n%100==0)
         {    balance=balance-n;
             System.out.println("Drawn amount is :"+n);
         }
         else
         System.out.println("can not possible this amount:");
     }
     else
         System.out.println("can not possible:");
 }
 public void enquiry()
 {    System.out.println(" name of the person:"+s1);
     System.out.println("person ID:"+id);
     System.out.println("Account Balence:"+balance);
 }
 }
 
 

