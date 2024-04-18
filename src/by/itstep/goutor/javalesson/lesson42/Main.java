package by.itstep.goutor.javalesson.lesson42;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOGGER.setLevel(Level.INFO);

//        LOGGER.trace("call trace method...");
//        LOGGER.debug("call debug method...");
//        LOGGER.info("call info method...");
//        LOGGER.warn("call warn method...");
//        LOGGER.error("call error method...");
//        LOGGER.fatal("call fatal method...");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        long res = factor(num);
        String s = String.format("%d! = %d", num, res);

        LOGGER.info(s);

    }

    public static long factor(int number) {
        LOGGER.debug("Input number is " + number);
        long res = 1;
        LOGGER.debug("Start: result = " + res);

        for (int i = 0; i <= number; i++) {
            res *= i;
            LOGGER.trace(String.format("i = %d, result = %d", i, res));
        }
        LOGGER.debug("return number is " + res);
        return res;
    }
}
