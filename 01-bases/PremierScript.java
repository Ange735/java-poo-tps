import java.util.Scanner;
public class PremierScript {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer une valeur de type byte :");
        byte b = sc.nextByte();System.out.println("Byte value: " + b);
        System.out.println("Veuillez entrer une valeur de type short :");
        short s = sc.nextShort();System.out.println("Short value: " + s);
        System.out.println("Veuillez entrer une valeur de type int :");
        int i = sc.nextInt();System.out.println("Int value: " + i);
        System.out.println("Veuillez entrer une valeur de type long :");
        long l = sc.nextLong();System.out.println("Long value: " + l);
        System.out.println("Veuillez entrer une valeur de type float :");
        float f = sc.nextFloat();System.out.println("Float value: " + f);
        System.out.println("Veuillez entrer une valeur de type double :");
        double d = sc.nextDouble();System.out.println("Double value: " + d);
        System.out.println("Veuillez entrer une valeur de type boolean :");
        boolean bool = sc.nextBoolean();System.out.println("Boolean value: " + bool);
        System.out.println("Veuillez entrer une valeur de type char :");
        sc.close();
    }
}
