import java.util.Scanner;

public class Patterns { 
    static void pattern1(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Hi ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern4(int n)
    {
        for(int i=n; i>0; i++)
        {
            for(int j=n;j<0;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0;j<n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n)
    {
       
        for(int i=0; i<n; i++)
        {
             //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("x");
            }
            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.err.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n)
    {
       
        for(int i=0; i<n; i++)
        {
             //space
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*n-(2*i+1);j++)
            {
                System.out.print("x");
            }
            //space
            for(int j=0;j<i;j++)
            {
                System.err.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n)
    {
        int start=1;
        for(int i=0; i<n; i++)
        {
          if(i%2==0)start=1;
            else start=0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
            }
            System.out.println();
        }
    }
    static void pattern9(int n)
    {
        int space=2*(n-1);
        for(int i=1; i<=n; i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=0;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.err.print(j);
            }

            System.out.println();
            space -=2;
        }
    }

public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the input vaue u need to take");
   int value =sc.nextInt();
   pattern9(value);
//    pattern7(value);
}
}
