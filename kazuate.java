package hello;
import java.util.Scanner;

public class kazuate {
    public static void main(String[] args) {
        // プログラム内で設定する数
        int targetNumber = 42;
        
        Scanner scanner = new Scanner(System.in);
        int guessCount = 0;
        
        System.out.println("数当てゲームを開始します！2桁の正の整数を予想してください。");
        
        while (guessCount < 5) {
            System.out.print("予想した数を入力してください: ");
            int userGuess = scanner.nextInt();
            guessCount++;
            
            if (userGuess == targetNumber) {
                System.out.println("当たり！おめでとうございます！");
                break;
            } else if (userGuess > targetNumber) {
                System.out.println("設定された数より大きいです。");
            } else {
                System.out.println("設定された数より小さいです。");
            }
            
            if (Math.abs(userGuess - targetNumber) >= 20) {
                System.out.println("20以上差があります。");
            }
        }
        
        if (guessCount == 5) {
            System.out.println("ゲームオーバー！正解は " + targetNumber + " でした。");
        }
        
        scanner.close();
    }
}
