import java.util.Scanner;

public class BodyWeightIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Can nang co the cua ban la :");
        double weight = scanner.nextDouble();

        System.out.println("Chieu cao co the cua ban la :");
        double height = scanner.nextDouble();

        System.out.println("Chi so BMI cua ban la :");
        double BMI = weight / (height * height);

        if (BMI < 18) {
            System.out.println("Ban da bi beo phi");
        } else if (BMI < 25) {
            System.out.println(" Ban binh thuong");
        } else if (BMI < 30) {
            System.out.println("Ban gay");
        } else {
            System.out.println("Ban rat gay");
        }
    }
}
