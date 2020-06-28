package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer validCustomer = new Customer(
                "egor",
                "egor@mail.ru",
                "+375257635329",
                LocalDate.of(1998, 12, 14)
        );

        Customer invalidCustomer = new Customer(
                "egor",
                "egor@mail.ru",
                "+375257635329",
                LocalDate.of(2012, 12, 14)
        );

        CustomerRegistrationValidator result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult());

        ValidationResult validResult = result.apply(validCustomer);
        ValidationResult invalidResult = result.apply(invalidCustomer);


        System.out.println(validResult);
        System.out.println(invalidResult);

        if (validResult != ValidationResult.SUCCESS) {
            throw new IllegalStateException(validResult.name());
        }

        if (invalidResult != ValidationResult.SUCCESS) {
            throw new IllegalStateException(invalidResult.name());
        }
    }
}
