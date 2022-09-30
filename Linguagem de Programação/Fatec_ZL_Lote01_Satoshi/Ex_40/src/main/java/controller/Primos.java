package controller;

public class Primos {
    public Primos(){
        super();
    }

    public void primo(int n1,int n2){
        boolean p;

        if(n1 > n2) {
            for (int i = n1; i >= n2; i--) {
                    p = isPrime(i);
                    if(p) {
                        System.out.print(i + " ");
                    }
            }
        }else{
            for (int i = n1; i <= n2; i++) {
                p = isPrime(i);
                if(p) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    static boolean isPrime(int n){
        if (n == 2) return true;
        if (n == 3) return true;
        if (n == 1) return false;
        if (n % 2 == 0) return false;
        if (n % 3 == 0) return false;

        int i = 5;
        int w = 2;
        while (i * i <= n) {
            if(n % i == 0)
                return false;

            i += w;
            w = 6 - w;
        }
        return true;
    }
}
