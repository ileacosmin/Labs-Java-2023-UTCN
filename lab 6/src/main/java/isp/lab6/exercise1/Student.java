package isp.lab6.exercise1;

import java.util.HashMap;

public class Student {
    private String name;
    private int id;
    private HashMap<String,Integer> grades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades =new HashMap<>();
    }
    public Student() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<String, Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(String subject,int grade){
        grades.put(subject,grade);
    }


}
