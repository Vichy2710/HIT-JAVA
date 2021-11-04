package Bai5;

public class RunMain {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
        System.out.println(isPrime(2.9));
        System.out.println(isPrime(7L));
        System.out.println(isPrime(3.4f));

    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        else{
            for (int i=2;i<=n/2;i++)
                if(n%i==0)
                    return false;
            return true;
        }
    }
    public static boolean isPrime(long n){
        if(n<2){
            return false;
        }
        else{
            for (long i=2;i<=n/2;i++)
                if(n%i==0)
                    return false;
            return true;
        }
    }
    public static boolean isPrime(float n){
        return false;
    }
    public static boolean isPrime(double n){
        return false;
    }
}

