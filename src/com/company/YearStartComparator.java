package com.company;

public class YearStartComparator implements java.util.Comparator<Group> {


    @Override
    public int compare(Group o1, Group o2) {
        return o1.getYearStart() - o2.getYearStart();
    }
}
