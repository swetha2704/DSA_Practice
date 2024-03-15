import java.util.Scanner;

public class AmstrongNum {
    //371 = 3*3*3+7*7*7+1*1*1=371 it i
    //35 = 3*3*3 + 5*5*5 =134 not
    public static void main(String[] args) {
        System.out.println("enter the number to check Amstrong");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,duple=n;
        while (n>0) {
            int lastdigit=n%10;
            sum= sum+(lastdigit*lastdigit*lastdigit);
            n=n/10;
        }
        if(duple==sum)
        {
            System.out.println("Amstrong number");
        }
        else{
            System.out.println("Not Amstrong");
        }
    }
}
