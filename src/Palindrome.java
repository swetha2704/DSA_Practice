import java.util.Scanner;

public class Palindrome {
    public static void Palindrome(int n)
    {
        int revn=0, duple = n ;
        while (n>0) 
        {
            int lastdigit = n%10;
            revn = (revn * 10)+lastdigit;
            n=n/10;
        }
        System.out.println("Reversed num is "+revn);
        if(duple==revn){
            System.out.println("it is Palindrome");
        }
        else{
            System.out.println("it is not Palindrome");
        }
       
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to be Reveresed:");
        int n= sc.nextInt();
        Palindrome(n);
    }
}

