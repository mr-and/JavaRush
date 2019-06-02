package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String FileNameOne = reader.readLine();
        String FileNameTwo = reader.readLine();
        String FileNameThree = reader.readLine();


        FileInputStream fileOne = new FileInputStream(FileNameOne);
        FileOutputStream fileTwo = new FileOutputStream(FileNameTwo);
        FileOutputStream fileThree = new FileOutputStream(FileNameThree);

        int lengthSecondFile;

        while (fileOne.available() > 0) {

            if (fileOne.available() % 2 == 0) {
                lengthSecondFile = fileOne.available() / 2;
            } else
                lengthSecondFile = fileOne.available() / 2 + 1;

            byte[] bufferForSecondFile = new byte[lengthSecondFile];
            byte[] bufferForThreadFile = new byte[fileOne.available() / 2];

            fileTwo.write(bufferForSecondFile, 0, fileOne.read(bufferForSecondFile));

            fileThree.write(bufferForThreadFile, 0, fileOne.read(bufferForThreadFile));
        }
        reader.close();
        fileOne.close();
        fileTwo.close();
        fileThree.close();

    }
}
