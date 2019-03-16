package com.ichibrosan;

public class Main {

    public static int compareTwo(int x,int y) {
        if (x < y) {
            return(-1);
        }
        if (x > y) {
            return (1);
        }
        return (0);
    }

    public static void main(String[] args) {

        if(compareTwo(1,2) == -1) {
            System.out.println("x<y case PASSED");
        } else {
            System.out.println("x<y case FAILED");
        }

        if(compareTwo(2,1) == 1) {
            System.out.println("x>y case PASSED");
        } else {
            System.out.println("x>y case FAILED");
        }

        if(compareTwo(1,2) == 0) {
            System.out.println("x=y case PASSED");
        } else {
            System.out.println("x=y case FAILED");
        }



    }
}
