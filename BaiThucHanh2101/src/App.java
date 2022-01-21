import java.util.Scanner;
public class App {
public static void main(String[] args) throws Exception{
    double a, b, c, delta;
    double x1, x2;
    try (Scanner abc = new Scanner(System.in)) {
        System.out.println("Nhap vao he so A:");
            a = abc.nextDouble();
        System.out.println("Nhap vao he so B:"); 
            b = abc.nextDouble();  
        System.out.println("Nhap vao he so C:");
            c = abc.nextDouble();
    }  
        delta = b * b - 4 * a * c;
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Phuong trinh co hai nghiem la: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep la: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem");
    }
}
}