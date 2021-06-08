package org.imshenik.golovach;

import java.io.*;


//Reader Writer - потоки char-ов.
public class App09_MyDecorator extends OutputStream {
    private final OutputStream outputStream;

    public App09_MyDecorator(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void write(int b) throws IOException {
        System.out.println("LOG | Write size : 1");
        outputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        System.out.println("LOG | Write size : " + b.length);
        outputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        System.out.println("LOG | Write size : " + len);
        outputStream.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        outputStream.flush();
    }

    @Override
    public void close() throws IOException {
        outputStream.close();
    }
}
