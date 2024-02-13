package br.com.patterns.creational.singleton.approach03;

import java.io.Serial;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    @Serial
    protected Object readResolve() {
        return getInstance();
    }

}
