
import java.util.Scanner;
public class experiments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String actualPassword = "123";

        String password = input.nextLine();

        if (actualPassword.equals(password)){
            System.out.println("Password Correct");
        }

    }
}



