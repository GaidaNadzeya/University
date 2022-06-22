package com.company.util;

import com.company.Address;
import com.company.Student;
import com.company.Teacher;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserUtil {
    public static List<Student> createStudents(String fileName) {
        List<Student> parserStudents = new ArrayList<>();

        FileReader fileReader = null;


        try {
            fileReader = new FileReader(fileName);
            int a;
            String data = "";
            while ((a = fileReader.read()) != -1) {
                data += (char) a;
            }
            String[] dataNew = data.split("\r\n");
            for (String s : dataNew) {
                String[] dataWord = s.split(" ");
                Address addressRead = new Address(dataWord[2], dataWord[3], Integer.valueOf(dataWord[4]), Integer.valueOf(dataWord[5]));
                System.out.print("name = " + dataWord[0] + " age = " + dataWord[1] + "  address = " + addressRead + "\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return parserStudents;
    }

    public static List<Teacher> createTeacher(String fileName) {
        List<Teacher> parserTeacher = new ArrayList<>();

        FileReader fileReader = null;


        try {
            fileReader = new FileReader(fileName);
            int a;
            String data = "";
            while ((a = fileReader.read()) != -1) {
                data += (char) a;
            }
            String[] dataNew = data.split("\r\n");
            for (String s : dataNew) {
                String[] dataWord = s.split(" ");
                Address addressRead = new Address(dataWord[2], dataWord[3], Integer.valueOf(dataWord[4]), Integer.valueOf(dataWord[5]));
                System.out.print("name = " + dataWord[0] + " age = " + dataWord[1] + "  address = " + addressRead + " stavka ="+dataWord[6]+"\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return parserTeacher;
    }

}

