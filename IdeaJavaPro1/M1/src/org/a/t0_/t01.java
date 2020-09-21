package org.a.t0_;

public class t01 {

    public static  int delete(int a[]) {

        int i, j = 0;
        for (i = 0; i < a.length; i++) {
            if ( i == 0||a[i] != a[i - 1] ) {
                a[j] = a[i];
                j++;
            }

        }
        return j;
    }
    public static void main(String[] args) {
        int[] ints = {1, 2, 2, 3, 4, 4};

        int length=delete(ints);

        System.out.println(length);

        for (int i = 0; i <length ; i++) {
            System.out.println(ints[i]);
        }

    }
}