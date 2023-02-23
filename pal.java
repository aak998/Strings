import java.util.Scanner;

public class pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter new string");
        String a = sc.next();
        for (int i = 0; i < a.length() / 2; i++) {
            char start = a.charAt(i);
            char end = a.charAt(a.length() - 1 - i);
            String b = ((start != end) ? "not palindrome" : "palindrome");
            System.out.println("" + b);
         /*   if (start!=end ){
                System.out.println("it is not palindrome");
            }
            else {
                System.out.println("it is palindrome");
            }
        }*/
        }
    }
}
