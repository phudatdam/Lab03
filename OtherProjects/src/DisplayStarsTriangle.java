import java.util.Scanner;

public class DisplayStarsTriangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter triangle's height:");
		int height = keyboard.nextInt();
		for (int i = 1; i <= height; i++) {
			String spaces = " ".repeat(height - i);
			String stars = "*".repeat(2 * i - 1);
			System.out.println(spaces + stars + spaces);
		}
	}
}
