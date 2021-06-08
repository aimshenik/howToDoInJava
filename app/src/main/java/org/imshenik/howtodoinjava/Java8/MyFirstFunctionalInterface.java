package org.imshenik.howtodoinjava.Java8;

@FunctionalInterface
public interface MyFirstFunctionalInterface<T> {
    public void doJob();

    public default String kkk() {
        return "kkk";
    }

    @Override
    public boolean equals(Object obj);        //Overridden from Object class
}

