import java.util.Scanner;
public class octal {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Your Number:- ");
        int userNumber = myObj.nextInt();
        while(0 < userNumber){
            int remainder = getRemainder(userNumber);
            System.out.println(remainder);
            userNumber = getQuotient(userNumber);
            System.out.println(userNumber);
        }
    }

    private static int getQuotient(int userNumber) {
        return userNumber/10;
    }

    private static int getRemainder(int userNumber) {
        return userNumber%10;
    }
}




//ctrl shift A => actions
//ctrl F10 => Running the code
//ctrl+Alt+S => setting
// Code snipitts