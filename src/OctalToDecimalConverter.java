public class OctalToDecimalConverter {
    public static void main(String[] args){
        String Octal = args[0];
        if(Octal.contains("8") || Octal.contains("9")){
            System.out.println("Number is not Octal");
            return ;
        }
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