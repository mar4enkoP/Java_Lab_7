package com;

public class Main {

    public static void main(String[] args) {
        Сomplex complex = new Сomplex();
        complex.ansver("1", "2i", "3", "4i", "+");
        complex.ansver("2", "2i", "3", "4i", "-");
        complex.ansver("3", "2i", "3", "4i", "*");
        complex.ansver("4", "2i", "3", "4i", "/");
    }
}
