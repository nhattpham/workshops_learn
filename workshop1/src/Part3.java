
import java.util.Scanner;

/**
 *
 * @author meoca
 */
public class Part3 {
    public static void main(String[] args) {
        String[] list = new String[2];
        //input the list of names
        System.out.println("Please enter the ten names:");
        for (int i = 0; i < 2; i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println(i + ": ");
            // Ensure that message is readable before
            // asking for input
            System.out.flush();
            
            //store the input
            list[i] = sc.nextLine();
        }
        //C2 : 
        String stringfromclient1 = "";
	for (String x : list) {
		stringfromclient1 = stringfromclient1 + (x.substring(0, 1).toUpperCase() + x.substring(1));
		stringfromclient1 = stringfromclient1 + "\n";
	}
	System.out.println("Biến các chữ đầu thành hoa: \n" + stringfromclient1);
        //C2: chuyen tat ca thanh chu in hoa :
//        for (String l : list){
//            System.out.println(l.toUpperCase());
//        }
    }
}
