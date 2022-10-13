import java.util.*;

class Main
{
    public static void main(String [] args)
    {
        // A number declared
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();	       
        //Calling checkFibonacci() user defined method inside the condition
        //if the checkFibonacci() returns true then print the number as a Fibonacci number
        //else print it is not a Fibonacci number
        if (checkFibonacci(num) == true)
            System.out.println("True");
        else
            System.out.println("False");    
    }
    
    //checkFibonacci() user defined method to check number is Fibonacci or not
    static boolean checkFibonacci(int num)
    {
        //Calling checkPerfectSquare() method and passing the parameter 
        //after geting the value by using the formula
        //this method returns true if it is perfect square else returns false
        return checkPerfectSquare(5*num*num + 4) || checkPerfectSquare(5*num*num - 4);
    }
    
    //checkPerfectSquare() user defined method to check number is Perfect Square or not.
    static boolean checkPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
}