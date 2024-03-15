public class GCDandHCF {

    // Greatest common divisors
    // Highest Commin factor
    public static void gcd(int a, int b)
    {
        while (a>0 && b>0) {
            if(a>b) a= a%b;
            else b= b%a;
        }
        if(a==0){
            System.out.println(b);
        }
        else
        {
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        gcd(3,11);
    }
    
}
