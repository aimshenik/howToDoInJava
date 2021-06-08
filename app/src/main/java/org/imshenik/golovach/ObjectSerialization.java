package org.imshenik.golovach;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ObjectSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HumanBean humanBean = new HumanBean("Andrey", "Imshenik", "+51412333", 33, 199, 99);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new GZIPOutputStream(
                        new FileOutputStream(
                                new File("Human.txt")))
        );
        objectOutputStream.writeObject(humanBean);
        objectOutputStream.flush();
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new GZIPInputStream(
                        new FileInputStream(
                                new File("Human.txt"))));
        HumanBean h = (HumanBean) objectInputStream.readObject();
        System.out.println(h.toString());
    }
}
