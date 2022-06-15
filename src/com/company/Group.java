package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Group {
    private String nameGroup;
    private int course;
    private List<Student> studentList = new ArrayList<>();
    private Teacher teacher;
    private int yearEnd;
    private int yearStart;


    /*  public Group(int countStudent){
          students = new Student[countStudent];
      }

     */
    public Group() {

    }

    public Group(String nameGroup, int yearEnd, int yearStart) {
        this.nameGroup = nameGroup;
        this.yearEnd = yearEnd;
        this.yearStart = yearStart;
    }

    public Group(String nameGroup, int course, List<Student> studentList, Teacher teacher, int yearEnd, int yearStart) {
        this.nameGroup = nameGroup;
        this.course = course;
        this.studentList = studentList;
        this.teacher = teacher;
        this.yearEnd = yearEnd;
        this.yearStart = yearStart;
    }
    /*  public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++)
            if (students[i] == null) {
                students[i] = student;
                return;
            }

    }

   */

    /*public void deleteStudent(Student student) {
        for (int i = 2; i < students.length-1; i++)
            if (students[i-1] == students[i]) {
                students[i] = null;
                return;
            }

    }

     */


    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(int yearEnd) {
        this.yearEnd = yearEnd;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    @Override
    public String toString() {
        return "Group{" +
                "nameGroup='" + nameGroup + '\'' +
                ", course=" + course +
                ", studentList=" + studentList +
                ", teacher=" + teacher +
                ", yearEnd=" + yearEnd +
                ", yearStart=" + yearStart +
                '}' + "\n";
    }
}
