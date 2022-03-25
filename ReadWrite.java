package com.company;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ReadWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\InputFile.txt");
        FileInputStream inputStream = new FileInputStream(file);
        Scanner sc = new Scanner(inputStream);
        StringBuffer buffer = new StringBuffer();
        while(sc.hasNext()) {
            buffer.append(" "+sc.nextLine());
        }
        System.out.println("Contents of the original file: "+buffer);
        File dest = new File("D:\\OutputFile.txt");
        FileWriter writer = new FileWriter(dest);
        writer.write(buffer.toString());
        writer.flush();
        System.out.println("File copied!!");
    }
}