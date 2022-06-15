package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws AgeException {
        Address address1 = new Address("Минск", "Ленина", 5, 150);
        Teacher teacher1 = new Teacher("Иванов.И.И", 40, address1, 3.7, 100);
        Teacher teacher2 = new Teacher("Сидоров.И.И", 30, address1, 3.7, 150);
        Teacher teacher3 = new Teacher("Васильев.И.И", 50, address1, 3.7, 400);
        Teacher teacher4 = new Teacher("Ястремский.И.И", 70, address1, 3.7, 500);
        //  System.out.println(teacher1);
        //  teacher1.setStavka(4);
        //  teacher1.setNumberHours(180);
        //  teacher1.calculateSalary();
        Student student1 = new Student("Вася", 1, address1);
        Student student2 = new Student("Петя", 21, address1);
        //System.out.println(student1);
        Group group1 = new Group("111", 2020, 2015);
        Group group2 = new Group("222", 2015, 2010);
        Group group3 = new Group("333", 2013, 2008);
        Group group4 = new Group("444", 2005, 2000);
        group1.addStudent(student1);
        group1.addStudent(student2);
        //   System.out.println(group1);


        Converter<Methodist, Teacher> converter = teacher -> new Methodist("Петров А.А", 50, address1, 10, 50);
        Methodist methodist = converter.convert(teacher1);
        System.out.println(methodist);


        List<Teacher> teachersList = new ArrayList<>() {{
            add(teacher1);
            add(teacher2);
            add(teacher3);
            add(teacher4);
        }};

        teachersList.stream().sorted(Comparator.comparing(Teacher::getFIO)).collect(Collectors.toList()).forEach(System.out::println);

        teachersList.stream().filter(s -> s.getAge() > 60).forEach(s -> System.out.println("Старше 60:" + s));
        teachersList.stream().filter(s -> s.calculateSalary() > 600).forEach(s -> System.out.println("ЗП больше 600 р.: " + s));

        List<Group> groupList = new ArrayList<>() {{
            add(group1);
            add(group2);
            add(group3);
            add(group4);
        }};
        groupList.stream().filter(s -> s.getYearEnd() >= 2015).forEach(s -> System.out.println("Год выпуска больше 2015: " + s));


        Comparator yearComparator = new YearStartComparator();
        Collections.sort(groupList, yearComparator);
        System.out.println(groupList);

    }

}
