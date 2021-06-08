package org.imshenik.howtodoinjava.Java8;

import java.util.function.Consumer;

@FunctionalInterface
public interface OwnConsumer<T> extends Consumer<T> {
  void accept(T t);
}
