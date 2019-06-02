package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    private  FileInputStream fileInputStream;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if (fileName.endsWith(".txt")) {
            this.fileInputStream = new FileInputStream(fileName);
        }
        else {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    @Override
    public int read() throws IOException {
        return fileInputStream.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return fileInputStream.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return fileInputStream.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return fileInputStream.skip(n);
    }

    @Override
    public int available() throws IOException {
        return fileInputStream.available();
    }

    @Override
    public void close() throws IOException {
        fileInputStream.close();
    }

    @Override
    public FileChannel getChannel() {
        return fileInputStream.getChannel();
    }


    public static void main(String[] args) {
//        try {
//            new TxtInputStream("D:\\text.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (UnsupportedFileNameException e) {
//            e.printStackTrace();
//        }
    }
}

