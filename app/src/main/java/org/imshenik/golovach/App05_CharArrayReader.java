package org.imshenik.golovach;

import java.io.CharArrayReader;
import java.io.IOException;


//Reader Writer - потоки char-ов.
public class App05_CharArrayReader {
    public static void main(String[] args) throws IOException {
        char[] buff = new char[]{'H', 'e', 'l', 'l', 'o',')'};
        CharArrayReader charArrayReader = new CharArrayReader(buff);
        int c;
        while ((c = charArrayReader.read()) != -1) System.out.print((char) c);
    }
}
