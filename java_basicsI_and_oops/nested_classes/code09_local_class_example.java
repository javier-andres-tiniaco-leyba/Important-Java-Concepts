// https://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html

class LocalClassExample {
    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(
        String phoneNumber1, String phoneNumber2) {

        final int numberLength = 10;

        class PhoneNumber {
            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber){
                String currentNumber = phoneNumber.replaceAll(regularExpression,"");
                formattedPhoneNumber =
                    (currentNumber.length() == numberLength)?currentNumber:null;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        String isValid;
        isValid = myNumber1.getNumber() == null ? "invalid":myNumber1.getNumber();
        System.out.println("First number is " + isValid);
        isValid = myNumber2.getNumber() == null ? "invalid":myNumber2.getNumber();
        System.out.println("Second number is " + isValid);
    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890","456-7890");
    }

}
