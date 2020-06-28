package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // Function takes 1 argument and produces 1 result
        System.out.println(incrementByOne(0));

        System.out.println(incrementByOneFunction.apply(0));

        System.out.println(multiplyBy10Function.apply(1));

        System.out.println(incrementByOneThenMultiplyBy10Function.apply(1));

        // BiFunction takes 1 argument and produces 1 result

        System.out.println(incrementByOneAndMultiplyFunction.apply(1, 20));
    }


    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
    static Function<Integer, Integer> incrementByOneThenMultiplyBy10Function = incrementByOneFunction.andThen(multiplyBy10Function);
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy ;

    static int incrementByOne(int number) {
        return number + 1;
    }
}
