package com.company;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GroupTest {
    Group group511;
    Student student1;
    Student student2;

    @Before
    public void setUp() throws Exception {
        group511 = new Group();
        student1 = new Student("ВасяTest", 22, new Address("Минск", "Ленина", 150, 11));
        student2 = new Student("ПетяTest", 21, new Address("Брест", "Пушкина", 5, 1));
        group511.addStudent(student1);
        group511.addStudent(student2);
    }

    @Test
    public void addStudent() {

        Assert.assertNotNull(group511.studentList);
        Assert.assertEquals(2, group511.studentList.size());
    }

    @Test
    public void removeStudent() {
        group511.removeStudent(student1);
        Assert.assertNotNull(group511.studentList.get(0));
        Assert.assertEquals(student2,group511.studentList.get(0));

    }

    @After
    public void tearDown() throws Exception {
    }
}