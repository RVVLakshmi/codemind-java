import java.util.Scanner;

class Example13 {

    public static void main(String args[])
       {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Input a number : ");
        int num = sc.nextInt();
        int ans = 0;
    
        for(int i=0; i<num; i++)
        {
            if(i*(i+1) == num)
            {
                ans = 1;
                break;
            }
        }
         
        if(ans == 1)
            System.out.println("YES");
        else
            System.out.println("NO");      
    }
}
