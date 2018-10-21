package com.zadachi;

public class Main {

    public static void main(String[] args) {
        int i=0, x=0;
        do {
            i++;
            if (((i%2==0)&&(i%7==0))&&!(i%3==0))
            {
                System.out.print(i+" ");
                x++;
            }
        }while(x!=15);
    }
}
