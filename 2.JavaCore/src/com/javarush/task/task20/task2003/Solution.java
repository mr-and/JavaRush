package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws IOException {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        try {
            load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        try
        {
            for (Map.Entry<String,String> map : properties.entrySet())
            {
                prop.put(map.getKey(),map.getValue());
            }
            prop.store(outputStream, null);
            outputStream.close();
        }catch (IOException io)
        {
            io.printStackTrace();
        }
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        try
        {
            prop.load(inputStream);
            for (String x : prop.stringPropertyNames())
                properties.put(x, prop.getProperty(x));
        }catch (Exception e){e.printStackTrace();}

    }

    public static void main(String[] args) {

    }
}
