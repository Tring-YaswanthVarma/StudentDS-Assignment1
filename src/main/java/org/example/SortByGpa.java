package org.example;

import java.util.Comparator;

class SortByGpa implements Comparator<StudentDS> {
    public int compare(StudentDS a, StudentDS b) {
        return (int) (b.getGpa() - a.getGpa());
    }
}
