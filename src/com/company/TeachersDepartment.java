package com.company;

import java.util.ArrayList;
import java.util.List;

public class TeachersDepartment {

    private List<Teacher> teachers = new ArrayList<>();
    private List<Methodist> methodists = new ArrayList<>();


    public void seeTeachersDepartment() {
        for (int i = 0; i < teachers.toArray().length; i++)
            System.out.println(teachers.get(i));
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }
}
