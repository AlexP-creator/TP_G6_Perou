package com.isep.tp2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        boolean result = isBinarySumInArray(new int[]{1, 2, 4, 5}, 3);
        System.out.println("Le résultat est " + result);
    }

    public static boolean isBinarySumInArray(int[] tableau, int val) {
        int n = tableau.length;

        for(int i = 0; i < n - 1; ++i) {
            for(int j = i + 1; j < n; ++j) {
                int somme = tableau[i] + tableau[j];
                if (somme == val) {
                    return true;
                }
            }
        }

        return false;
    }
}
