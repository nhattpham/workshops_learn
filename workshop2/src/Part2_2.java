
import java.util.Scanner;

/**
 *
 * @author meoca
 */
public class Part2_2 {
    public String inputString() throws Exception{
        String pattern = "(^SE[0-9]{3}$)";
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("input string:");
        s = sc.nextLine();
        if (!s.matches(pattern))
            throw new Exception();
        return s;
    }
    public static void main(String[] args) {
        Part2_2 obj = new Part2_2();
        boolean cont = false;
        do{
            try {
                String s = obj.inputString();
                System.out.println("the string is " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("the string is invalid");
                cont = true;
            }
        }while(cont);
    }
}
