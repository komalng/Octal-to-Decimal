public class OctalToDecimalConverter {
    public static void main(String[] args) {
        String userNumber = args[0];
        String[] arrOfStr = userNumber.split("");
        for (int a = arrOfStr.length - 1; a >= 0; a--) {
            System.out.println(arrOfStr[a]);
        }

//        int addRemainder = 0;
//        int exponent = 0;
//        while(0 < userNumber){
//            int remainder = getRemainder(userNumber);
//            addRemainder = addRemainder + remainder*(int)(StrictMath.pow(8,exponent));
//            userNumber = getQuotient(userNumber);
//            exponent = exponent + 1;
//        }
//        System.out.println(addRemainder);
//
//    }

//    private static int getQuotient(int userNumber) {
//        return userNumber/10;
//    }
//
//    private static int getRemainder(int userNumber) {
//        return userNumber%10;
//    }
    }
}