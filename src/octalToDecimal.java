public class octalToDecimal {
    public static void main(String[] args){
        int userNumber = Integer.parseInt(args[0]);
        int addRemainder = 0;
        int exponent = 0;
        while(0 < userNumber){
            int remainder = getRemainder(userNumber);
            addRemainder = addRemainder + remainder*(int)(StrictMath.pow(8,exponent));
            userNumber = getQuotient(userNumber);
            exponent = exponent + 1;
        }
        System.out.println(addRemainder);

    }

    private static int getQuotient(int userNumber) {
        return userNumber/10;
    }

    private static int getRemainder(int userNumber) {
        return userNumber%10;
    }
}