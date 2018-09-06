import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Random rand = new Random();
            int num1 = 1 + rand.nextInt((10 - 1) + 1);
            int num2 = 1 + rand.nextInt((10 - 1) + 1);
            int sum = num1 + num2;
            String input = JOptionPane.showInputDialog(num1 + " + ? = " + sum);
            if (Integer.parseInt(input) == num2) {
                JOptionPane.showMessageDialog(null, "ถูกต้องนะครับ", "เฉลย", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ผิดนะครับ " + num1 + " + " + num2 + " = " + sum, "เฉลย", JOptionPane.INFORMATION_MESSAGE);
            }

            int ans = JOptionPane.showConfirmDialog(null, "เล่นต่อมั๊ย", "exit", JOptionPane.YES_NO_OPTION);
            if (ans != JOptionPane.YES_NO_OPTION) {
                break;
            }
        }

    }
}
