package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        class Gen<T> {
            T ob;


            Gen(T o) {
                ob = o;
            }


            T getob() {
                return ob;
            }


            void showType() {
                System.out.println("Тип T: " + ob.getClass().getName());
            }
        }


        Gen<Integer> iOb;


        iOb = new Gen<Integer>(7);


        iOb.showType();


        int value = iOb.getob();
        System.out.println("Значение:" + value);


        Gen<String> strOb = new Gen<String>("Обобщённый текст");


        strOb.showType();


        String str = strOb.getob();
        System.out.println("Значение: " + str);

        System.out.println(Arrays.toString(Month.getSummerMonths()));
    }
}











