import java.util.*;  
import java.io.*;  
public class CullenNumber 
{  
//function that calculates the nth Cullen number  
static int cullenNumber(int n)  
{  
return (1 << n) * n + 1;       
}  
//driver code  
public static void main(String args[])  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
//reads an integer from the user  
int n = sc.nextInt();   
System.out.println("Cullen Number for the value n = " +n +" is: " +cullenNumber(n));  
}  
}  
