package Ss9Rikke;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return (width + height) * 2;
    }
    public void printInfo() {
        System.out.printf("Width: %.2f%n", width);
        System.out.printf("Height: %.2f%n", height);
        System.out.printf("Dien tich: %.2f%n", getArea());
        System.out.printf("Chu vi: %.2f%n", getPerimeter());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào chiều rộng:");
        double width = sc.nextDouble();
        System.out.println("Nhập vào chiều dài:");
        double height = sc.nextDouble();
         if(width <= 0 && height <=0) {
             System.out.println("Độ dài phải lớn hơn 0");
             return;
         }
         Rectangle r = new Rectangle(width,height);
         r.printInfo();

    }
}
