package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer egor = new Customer("Egor", "+375257635329");
        greetCustomer(egor);
        greetCustomerConsumer.accept(egor);
        greetCustomerBiConsumer.accept(egor, false);
    }

    static void greetCustomer(Customer customer) {
        System.out.println(
                "Hello " + customer.customerName +
                ", thanks for registering phone number " + customer.customerPhoneNumber);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
        System.out.println(
                "Hello " + customer.customerName +
                ", thanks for registering phone number " + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
        System.out.println(
                "Hello " + customer.customerName +
                (showPhoneNumber ? ", thanks for registering phone number " + customer.customerPhoneNumber : "!"));


    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
