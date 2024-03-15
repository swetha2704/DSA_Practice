import java.util.Scanner;

public class Reversnumber {
    public static void Reverse(int n)
    {
        int revn=0;
        while (n>0) 
        {
            int lastdigit = n%10;
            revn = (revn * 10)+lastdigit;
            n=n/10;
        }
        System.out.println(revn);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to be Reveresed:");
        int n= sc.nextInt();
        Reverse(n);
    }
}
