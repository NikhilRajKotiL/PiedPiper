package com.example.piedpiper.encrypto;

public class DiffieHellman {
    static int p = 51;
    static int g = 5;

    public static int publicKey(int a){
        final int i = computePower(g, p, a);
        return i;
    }

    public static int secretKey(int pkey, int a) {
        final int i = computePower(pkey,p,a);
        return i;
    }

    private static int computePower(int g, int p, int a){
        int temp = g;
        for (int i = 1;i<a;i++) {
            g = g * temp;
            g = g % p;
        }
        return g;
    }
}
