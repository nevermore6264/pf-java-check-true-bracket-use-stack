import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        String strExpr;
        Scanner scanner = new Scanner(System.in);
        strExpr = scanner.nextLine();

        Stack<Integer> ParentPos = new Stack<>();
        for (int i = 0; i < strExpr.length(); i++) {
            if (strExpr.charAt(i) == '(') {
                ParentPos.push(i);
            } else if (strExpr.charAt(i) == ')') {
                if (!ParentPos.empty()) {
                    ParentPos.pop();
                } else {
                    ParentPos.push(i);
                }
            }
        }

        if (ParentPos.empty())
            System.out.println("Parentness string is right format");
        else {
            System.out.println("Parentness string is not in right format");
            while (!ParentPos.empty()) {
                System.out.println("at position : " + ParentPos.peek());
                ParentPos.pop();
            }
        }
    }
}
