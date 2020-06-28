package callback;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        hello("Egor", "Ragulin", value -> {
            System.out.println("no last name provided for " + value);
        });

        hello("Egor", null, value -> {
            System.out.println("no last name provided for " + value);
        });

        hello2("Egor", "Ragulin", () -> {
            System.out.println("no lastName provided");
        });

        hello2("Egor", null, () -> {
            System.out.println("no lastName provided");
        });
    }

    static void hello (String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        }
        else {
            callback.accept(firstName);
        }
    }

    static void hello2 (String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        }
        else {
            callback.run();
        }
    }
}
