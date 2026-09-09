import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("Enter your string: ");
        Scanner in = new Scanner(System.in);
            String s = in.nextLine();

        for(Character c : s.toCharArray()) {
            System.out.println((int)c);

        }
        in.close();
    }
}