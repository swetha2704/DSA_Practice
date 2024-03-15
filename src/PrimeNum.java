import java.util.Scanner;

public class PrimeNum {
    //number has exactly 2 factor 1 and itself
    // 11 = 1 & 11 ---> it is
    // 12=1 & 2 &4&3 & 6 -----. not prime number

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check wheater it is prime or not :");
        int n = sc.nextInt();
        int count=0;
        // for(int i=1;i<=n;i++)
        // {
        //     if(n%i==0)
        //     {
        //         count=count+1;
        //     }
        // }
        //TC:O(1)
        for(int i=1;Math.sqrt(i)<=n;i++)
        {
            if(n%i==0){
                count++;
            }
        }
            if(count==2)
            {
                System.out.println("it is prime");
            }
            else
            {
                System.out.println("it is not prime");
            }

    }




//TC:O(sqrt(n))
}
