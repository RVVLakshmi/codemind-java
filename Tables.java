import java.util.Scanner;  
class Sample  
{  
public static void main(String args[])   
{  
Scanner sc = new Scanner(System.in);  
//System.out.print("Enter number: ");       
//reading a number whose table is to be print  
int num=sc.nextInt();  
int range=sc.nextInt();
//loop start execution form and execute until the condition i<=10 becomes false  
int i=1;
while(i<=range)
{  
//prints table of the entered number
 if (i%2!=0)
    System.out.println(num+" x "+i+" = "+num*i); 
    i++;
}  
}  
}  