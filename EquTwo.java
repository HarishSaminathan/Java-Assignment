import java.util.Scanner;

public class EquTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String result = (a == b) ? "Numbers are equal" : "Numbers are not equal";
        System.out.println(result);
        
    }
}

