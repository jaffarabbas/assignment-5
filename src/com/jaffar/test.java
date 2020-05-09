package com.jaffar;

import java.util.Scanner;


class one{
    Scanner obj = new Scanner(System.in);

    String name;

    one(){
        this.name = obj.nextLine();
    }
}

class test{
    public static void main(String[] args) {
        one obj = new one();
    }
}