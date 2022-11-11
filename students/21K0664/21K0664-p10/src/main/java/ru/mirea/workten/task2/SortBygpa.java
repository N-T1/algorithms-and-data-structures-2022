package ru.mirea.workten.task2;


import java.util.Comparator;

public class SortBygpa implements Comparator<Student> {

    public int compare(Student a, Student b) {
        return b.getGpa() - a.getGpa();
    }

}
