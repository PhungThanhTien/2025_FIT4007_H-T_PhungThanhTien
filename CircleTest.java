import java.util.Scanner;

class Circle {
    // Thuộc tính
    private double radius;

    // Constructor mặc định (bán kính = 1)
    public Circle() {
        this.radius = 1;
    }

    // Constructor có tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter và Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Nhập bán kính từ bàn phím
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính r: ");
        radius = sc.nextDouble();
    }

    // Xuất thông tin hình tròn
    public void output() {
        System.out.println("Thông tin hình tròn:");
        System.out.println("Bán kính r: " + radius);
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Tính chu vi
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        // Tạo hình tròn mặc định
        Circle c1 = new Circle();
        c1.output();

        // Nhập lại bán kính từ bàn phím
        System.out.println("\nNhập hình tròn:");
        c1.input();

        // Xuất thông tin hình tròn sau khi nhập
        c1.output();
        System.out.println("Diện tích hình tròn: " + c1.getArea());
        System.out.println("Chu vi hình tròn: " + c1.getCircumference());
    }
}
