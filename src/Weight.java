import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        double height;

        System.out.println("Nhập số cân nặng: ");
        weight = sc.nextDouble();

        System.out.println("Nhập số chiều cao: (Met)");
        height = sc.nextDouble();

        double bmi = weight / Math.pow(height,2);

        if (bmi < 18.5){
            System.out.printf("Số cân nặng của bạn là %s: Bạn đang bị thiếu cân ", weight);
        }else if (18.5<=bmi && bmi<25.0){
            System.out.printf("\n Số cân nặng của bạn là %s: Bình thường", weight);
        }else if (25.0<=bmi && bmi < 30.0){
            System.out.printf("\n Số cân nặng của bạn là %s: Thừa cân", weight);
        }else {
            System.out.printf("\n Số cân nặng của bạn là %s: Béo Phì", weight);
        }
    }
}
