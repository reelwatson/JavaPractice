package org.example;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class LearningByteArrayInputStream {
    public static void main(String[] args) throws IOException {
        LearningByteArrayInputStream instanceLBAI = new LearningByteArrayInputStream();
        instanceLBAI.inputStream();
        instanceLBAI.myByteArrayInputStream();
    }

    public void inputStream() throws IOException {
        int keyboardInput = System.in.read(); //Reads keyboard input and returns ASCII value
        // Note: ONLY reads the first character
        System.out.println(keyboardInput);
    }

    public void myByteArrayInputStream() {
        try {
            String stringInput = "Muad'dib";
            byte[] byteArray = stringInput.getBytes();
            System.out.println("The byteArray for this word is " + Arrays.toString(byteArray));

            ByteArrayInputStream muaddibByteArrayInputStream = new ByteArrayInputStream(byteArray);
            int ch;

            System.out.print("The actual word is ");
            while ((ch = muaddibByteArrayInputStream.read()) != -1) {
                System.out.print((char) ch);
            }
            muaddibByteArrayInputStream.close();
        } catch (Exception e) {
            System.out.print(Arrays.toString(e.getStackTrace()));
        }
    }
}
