package org.example;

import java.util.*;
import java.util.logging.Logger;

public class StudentDS {
    private String name;
    private int age;
    private double gpa;

    StudentDS(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getGpa(){
        return this.gpa;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
}

class SortByGpa implements Comparator<StudentDS>{
    public int compare(StudentDS a, StudentDS b){
        return (int) (b.getGpa() - a.getGpa());
    }
}
class StudentTest{
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.api.jar");
        List<StudentDS> studentList = new ArrayList<>();
        StudentDS s1 = new StudentDS("abc", 1,34);
        StudentDS s2 = new StudentDS("def", 2, 68);
        StudentDS s3 = new StudentDS("ghi", 3, 96);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        for (StudentDS s : studentList){
            logger.info(s.getName() + ", " + s.getAge() + ", " + s.getGpa());
        }
        Collections.sort(studentList, new SortByGpa());
        logger.info("After Sorting");
        for (StudentDS s : studentList){
            logger.info(s.getName() + ", " + s.getAge() + ", " + s.getGpa());
        }

    }
}