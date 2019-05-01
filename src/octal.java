public class octal {
    public static void main(String[] args){
        int userNumber = Integer.parseInt(args[0]);
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