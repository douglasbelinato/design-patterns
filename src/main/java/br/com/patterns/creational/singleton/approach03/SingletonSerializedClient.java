package br.com.patterns.creational.singleton.approach03;

import java.io.*;

public class SingletonSerializedClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton serializedSingletonA = SerializedSingleton.getInstance();

        var out = new ObjectOutputStream(new FileOutputStream("fileA.txt"));
        out.writeObject(serializedSingletonA);
        out.close();

        var in = new ObjectInputStream(new FileInputStream("fileA.txt"));
        SerializedSingleton serializedSingletonB = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("serializedSingletonA instance" + serializedSingletonA.hashCode());
        System.out.println("serializedSingletonB instance" + serializedSingletonB.hashCode());

    }
}
