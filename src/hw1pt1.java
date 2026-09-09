
public class hw1pt1 {
    public static void main (String[] args) {
        String s = "Ava";

        for(char c : s.toCharArray()) {
            System.out.println(c + " = " + (int) c);
        }
    }
}