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
        String stringInput = "Muad'dib";
        byte[] byteArray = stringInput.getBytes();
        System.out.println(Arrays.toString(byteArray));

        ByteArrayInputStream muaddibByteArrayInputStream = new ByteArrayInputStream(byteArray);
    }
}
