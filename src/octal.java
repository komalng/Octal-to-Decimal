import java.util.Scanner;
public class octal {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Your Number:- ");
        int Number = myObj.nextInt();
        while(0 < Number){
            int digit = Number%10;
            System.out.println(digit);
            Number = Number/10;
            System.out.println(Number);
        }



    }
}




//ctrl shift A => actions
//ctrl F10 => Running the code
//ctrl+Alt+S => setting
// Code snipitts