import java.util.Scanner;
public class CountPrimes {
    static int findCountOfPrimes(int n)
    {
        int count=0;
        if(n<=1)
            return 0;
        for(int i=2;i<n;i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        if(n<=3)
            return true;
        if(n%2==0 || n%3==0)
            return false;
        for(int i=5;i*i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=findCountOfPrimes(n);
        System.out.println(count);
    }
}
