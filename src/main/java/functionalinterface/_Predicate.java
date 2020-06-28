package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        String validPhoneNumber = "+375257635329";
        String invalidPhoneNumber = "+37525763532";

        System.out.println(isPhoneNumberValid(validPhoneNumber));
        System.out.println(isPhoneNumberValid(invalidPhoneNumber));

        System.out.println(isPhoneNumberValidPredicate.test(validPhoneNumber));
        System.out.println(isPhoneNumberValidPredicate.test(invalidPhoneNumber));

        System.out.println(containsNumber25Predicate.test(validPhoneNumber));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber25Predicate).test(validPhoneNumber));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+375") && phoneNumber.length() == 13;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("+375") && phoneNumber.length() == 13;

    static Predicate<String> containsNumber25Predicate = phoneNumber ->
            phoneNumber.contains("25");
}
