package com;

public class Сomplex {
    double x; // реальная часть
    double y; // мнимая часть

    Сomplex(double real, double image) {// конструктор с параметрами
        this.x = real;
        this.y = image;

    }

    public Сomplex() {
    }

    public double getReal() {
        return x;
    }

    public void setReal(double real) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getImage() {
        return y;
    }


    Сomplex add (Сomplex a) {// add +
        double real = a.getReal();
        double image = a.getImage();
        double newReal = x + real;
        double newImage = y + image;
        Сomplex result = new Сomplex(newReal,newImage);
        return result;
    }

    Сomplex sub (Сomplex a) {// subtract -
        double real = a.getReal();
        double image = a.getY();
        double newReal = x - real;
        double newImage = y - image;
        Сomplex result = new Сomplex(newReal,newImage);
        return result;
    }

    Сomplex mul (Сomplex a) {// multiply *
        double real = a.getReal();
        double image = a.getY();
        double newReal = x*real - y *image;
        double newImage = y *real + x*image;
        Сomplex result = new Сomplex(newReal,newImage);
        return result;
    }

    Сomplex div (Сomplex a) {// share /
        double real = a.getReal();
        double image = a.getImage();
        double newReal = (x*real + y *image)/(real*real + image*image);
        double newImage = (y *real - x*image)/(real*real + image*image);
        Сomplex result = new Сomplex(newReal,newImage);
        return result;
    }

    public void print () {//  withdrawal
        if(y > 0){
            System.out.println(x + " + " + y + "i");
        }else if(y < 0){
            System.out.println(x + "" + y + "i");
        }else{
            System.out.println(x);
        }
    }

    public static void ansver(String event1,String event2,String event3,String event4,String operation){

        double a = Double.parseDouble (event1); // преобразовать вещественную часть строки в double
        double b = Double.parseDouble (event2.substring (0, event2.length () -1)); // преобразовать мнимую часть строкового типа с удаленным «i» в двойной тип
        double c = Double.parseDouble (event3); // преобразовать вещественную часть строки в double
        double d = Double.parseDouble (event4.substring (0, event4.length () -1)); // Преобразовать мнимую часть строки с удаленным «i» в double

        Сomplex num1 = new Сomplex(a,b);
        Сomplex num2 = new Сomplex(c,d);

        Сomplex result;
        int error = 1;
        int one,two;
        float answer;



        if (operation.equals ("+")) {
            result = num1.add(num2);
            result.print();
        }

        if (operation.equals ("-")) {
            result = num1.sub(num2);
            result.print();
        }

        if (operation.equals ("*")) {
            result = num1.mul(num2);
            result.print();
        }


        if (operation.equals ("/")) {

            if(num2.x * num2.x + num2.y *num2.y != 0){
                result = num1.div(num2);
                result.print();
                error = 0;
            }else{
                error = 1;
                System.out.println ("mistake");
            }
        }
        if(error==0){
        answer = (float) (((a+b)*Math.pow(c, 2))/(b-a));
        System.out.println("answer " + answer);}
    }

}

