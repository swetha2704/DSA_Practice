import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numberto be checked its divisors");
        int n = sc.nextInt();
        for(int i=1; i<=n ; i++)
        {
            if (n%i==0){
                System.out.println(i);
            }
        }

    }
}
//TC:O()
