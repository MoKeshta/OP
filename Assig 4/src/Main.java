import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int side1, side2, side3;
        String Color;
        boolean filled;
        Scanner S = new Scanner(System.in);
        side1 = S.nextInt();
        side2 = S.nextInt();
        side3 = S.nextInt();
        Color = S.next();
        filled = S.hasNext();

        Triangle T1 = new Triangle(side1, side2, side3);
        T1.setColor(Color);
        T1.setFilled(filled);

        System.out.println("The Color of the Triangle is " + T1.getColor());
        System.out.println("The Filing of the Triangle is " + T1.isFilled());
        System.out.println("The Area of the Triangle is " + T1.getArea());
        System.out.println("The Perimeter of the Triangle is" + T1.getPer());

    }
}