public class octal {
    public static void main(String[] args){
        int userNumber = Integer.parseInt(args[0]);
        int add_remainder = 0;
        while(0 < userNumber){
            int remainder = getRemainder(userNumber);
            System.out.println(remainder);
            add_remainder = add_remainder + remainder;
            System.out.println(add_remainder);
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