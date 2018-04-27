package scan;

import java.io.FileReader;
import java.util.*;
import java.lang.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Gabriel Bergstrom
 */


public class FileScannerTester {

    public static void main(String[] args) {

        FileScanner read = new FileScanner();
        Scanner scan = new Scanner("/Users/gabe/Desktop/Stuff/School/Compilers/Text Scanner/src/TestDocuments/WordTester.txt");
        read.fileScanner(scan);
        System.out.println("Total # different words: " + read.getDifferentWordCount());
        System.out.println("Total # words: " + read.getTotalWordCount());
        System.out.println(read.getScannerResults());

        FileScanner read1 = new FileScanner();
        Scanner scan1 = new Scanner("/Users/gabe/Desktop/Stuff/School/Compilers/Text Scanner/src/TestDocuments/SpecialCharacterTest.txt");
        read1.fileScanner(scan1);
        System.out.println("Total # different words: " + read1.getDifferentWordCount());
        System.out.println("Total # words: " + read1.getTotalWordCount());
        System.out.println(read1.getScannerResults());

        FileScanner read2 = new FileScanner();
        Scanner scan2 = new Scanner("/Users/gabe/Desktop/Stuff/School/Compilers/Text Scanner/src/TestDocuments/HamletTest.txt");
        read2.fileScanner(scan2);
        System.out.println("Total # different words: " + read2.getDifferentWordCount());
        System.out.println("Total # words: " + read2.getTotalWordCount());
        System.out.println(read2.getScannerResults());
    }
}

