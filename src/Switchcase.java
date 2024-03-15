import java.util.Scanner;

public class Switchcase {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day value");
        int a=sc.nextInt();
        switch(a){
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            default:
                System.out.println("Other than specific");
                break;
        }
        sc.close();
    }
}
