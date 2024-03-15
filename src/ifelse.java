// printing grade of student

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter you marks : ");
        int a=sc.nextInt();
        if(a<=25)
        {
            System.out.println("Grade :F");
        }
        else if(a>=25 && a<=44){
            System.out.println("Grade:E");
        }
        else if(a>45 && a<49){
            System.out.println("Grade:D");
        }
        else if(a>=50 && a<=69){
            System.out.println("Grade:C");
        }
        else if(a>=70 && a<=79){
            System.out.println("Grade:B");
        }
        else if(a>=80 && a<=100){
            System.out.println("Grade:A");
        }
        sc.close();
    }
}
