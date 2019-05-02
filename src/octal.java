public class octal {
    public static void main(String[] args){
        int userNumber = Integer.parseInt(args[0]);
        int addRemainder = 0;
        while(0 < userNumber){
            int remainder = getRemainder(userNumber);
            addRemainder = addRemainder + remainder;
            System.out.println(addRemainder);
            userNumber = getQuotient(userNumber);
        }
    }

    private static int getQuotient(int userNumber) {
        return userNumber/10;
    }

    private static int getRemainder(int userNumber) {
        return userNumber%10;
    }
}