package com.multi.a_array;

public class Exec03 {
    public static void main(String[] args) {
        int[] a = new int[200];
        a[1] =1000;
        a[2] =2000;
        a[3] =3000;
        a[199] =5000;
        for(int i : a){
            System.out.println(i);
        }

        double[] b= new double[300];
        b[1] =10.1;
        b[2] =20.2;
        b[3] =30.2;
        b[49] =50.5;
        for(double i : b){
            System.out.println(i);
        }

        String[] c = {};
        for(String i : c){
            System.out.println(i);
        }

    }


}
