package utils;

import domain.Control;

import java.util.List;

public final class Singleton {
    private static Singleton instance;
    public Object value;

    private Singleton(Object value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Object getInstance(Object value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}