import java.util.Scanner;

public class Count {
    public static void CountingNumber(int n)
    {

    int count =0;
    while ( n > 0) {
        count = count+1;
        n=n/10;
    }
    System.out.println(count);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to be counted:");
        int n= sc.nextInt();
        CountingNumber(n);
    }
}


//TC: log10(N);
//if /2 then log2(N)