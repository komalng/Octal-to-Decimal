import java.util.Scanner;
public class octal {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Your Number:- ");
        int userNumber = myObj.nextInt();
        while(0 < userNumber){
            int digit = userNumber%10;
            System.out.println(digit);
            userNumber = userNumber/10;
            System.out.println(userNumber);
        }
    }
}




//ctrl shift A => actions
//ctrl F10 => Running the code
//ctrl+Alt+S => setting
// Code snipitts