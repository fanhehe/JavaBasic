package Util;

import static java.lang.System.out;

public interface Common {
    public static void print(Object message) {
        out.print(message);
    }

    public static void println(Object message) {
        out.println(message);
    }

    public static<T> void println(T[] message) {
        for(T item: message) {
            print(item);
            print(" ");
        }

        println("");
    }

    public static void println(int[] message) {
        for(int item: message) {
            print(item);
            print(" ");
        }

        println("");
    }
}