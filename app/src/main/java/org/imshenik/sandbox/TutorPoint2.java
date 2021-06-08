package org.imshenik.sandbox;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TutorPoint2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream zip = null;
        try {
            zip = new FileInputStream(new File("C:\\Source\\Refinitiv.zip"));
            fileInputStream = new FileInputStream(new File("C:\\Source\\Capture.png"));
            fileOutputStream = new FileOutputStream(new File("C:\\Source\\CaptureCopy.png"));

//            byte[] beginString = new byte[5];
//            for (int i = 0; i < beginString.length; i++) {
//                beginString[i] = (byte) zip.read();
//            }
//            System.out.println("Begin Is : " + new String(beginString));

            byte[] buff = new byte[7000];
            int len;
            long T1 = System.nanoTime();
            do {

                len = fileInputStream.read(buff, 0, buff.length);
                System.out.println("len = " + len);
                if (len < 0) break;
                fileOutputStream.write(buff, 0, len);
            } while (true);
            System.out.println(System.nanoTime() - T1);

            for (int i = 0; i < 10; i++) {
                System.out.print(Integer.toHexString(buff[i] & 0xFF) + " " );
            }

        } finally {
            Files.createLink(Paths.get("C:\\Users\\aimshenik\\Desktop"),  Paths.get("C:\\Users\\aimshenik\\Desktop"));
            fileOutputStream.close();
            fileInputStream.close();
        }
    }
}
