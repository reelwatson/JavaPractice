package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileInputOutput {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileInputOutput basicFileOps = new FileInputOutput();
        basicFileOps.createDeleteFileOperationsNoTryCatch();
        Thread.sleep(2000);
        basicFileOps.createDeleteFileOperationsCatchExceptions();
        Thread.sleep(2000);
        basicFileOps.castingPrimitives();
        Thread.sleep(2000);
        basicFileOps.castingForFileReading();
        Thread.sleep(2000);
        basicFileOps.castingForBufferedReader();
        Thread.sleep(2000);
    }

    // File Operations - create, delete, manage directory
    public void createDeleteFileOperationsNoTryCatch() throws IOException, InterruptedException {
        File dataFile = new File("irulanDiaryEntry.txt");

        boolean fileCreated = dataFile.createNewFile(); // requires throwing or catching exception
        System.out.println("File was created: " + fileCreated);

        Thread.sleep(1000);

        boolean fileDeleted = dataFile.delete();
        System.out.println("File was deleted: " + fileDeleted);
    }

    public void createDeleteFileOperationsCatchExceptions() {
        try {
            File dataFile = new File("litanyOfFear.txt");
            boolean fileCreated = dataFile.createNewFile();
            System.out.println("Was the file created? " + fileCreated);
            Thread.sleep(1000);

            boolean fileExists = dataFile.exists();
            System.out.println("Does the file exist? " + fileExists);
            Thread.sleep(1000);

            boolean fileDeleted = dataFile.delete();
            System.out.println("Was the file deleted? " + fileDeleted);
            Thread.sleep(1000);

        }
        catch (IOException ioe) {
            String errorClass = String.valueOf(ioe.getClass()); //All thanks to IntelliJ for String wrapping
            System.out.println("The method CDFOCE threw a" + errorClass + "exception.");
            System.out.println(Arrays.toString(ioe.getStackTrace()));
        }
        catch (Exception e) {
            String errorClass = String.valueOf(e.getClass());
            System.out.println(errorClass);
            System.out.println(e.getMessage());
        }

    }

    public void castingPrimitives() {
        double originalNumber = 5;
        float castToFloat = (float) originalNumber;
        long castToLong = (long) originalNumber;
        int castToInt = (int) originalNumber;
        char castToChar = (char) originalNumber;
        short castToShort = (short) originalNumber;
        byte castToByte = (byte) originalNumber;

        // Hey is there a way to do this casting in a loop???
        // Based on params like receiving data type
        // Actually it might be more work that way lol

        List<Object> listOfCastedPrimitives = new ArrayList<>();
        listOfCastedPrimitives.add(castToFloat);
        listOfCastedPrimitives.add(castToLong);
        listOfCastedPrimitives.add(castToInt);
        listOfCastedPrimitives.add(castToChar);
        listOfCastedPrimitives.add(castToShort);
        listOfCastedPrimitives.add(castToByte);


        System.out.println(listOfCastedPrimitives);
    }

    public void castingForFileReading() {
        try {
            // lol obviously fails because the file is empty
            FileReader reader = new FileReader("ornithopter.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.println((char) data);
                data = reader.read();
            }
            reader.close(); // Have to close similar to Scanner instance
        }
        catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getClass());
            System.out.println(Arrays.toString(fnfe.getStackTrace()));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void castingForBufferedReader() {
        // lol obviously fails because the file is empty
        try {
            BufferedReader reader = new BufferedReader(new FileReader("orangeCatholicBible.txt"));
            String line;

            while ((line = reader.readLine()) != null) { // Have to wrap the first part in parentheses
                System.out.println(line);
            }

            reader.close(); // Have to close similar to Scanner instance
        }
        catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getClass());
            System.out.println(Arrays.toString(fnfe.getStackTrace()));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void createFileWriterFile() throws IOException {
        FileWriter newFileEntry = new FileWriter("booksOfTheLiving.txt");
    }

    // Iterators and Streams - Process, transform

    // Custom methods and more - scale to need
}
