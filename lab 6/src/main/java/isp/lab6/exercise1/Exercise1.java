package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercise1 {
    static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Student> getStudents() {
        return students;
    }
    public void removeStudent(int i){
        System.out.println("Before removing: " + students);
        students.remove(i);
        System.out.println("After removing: " + students);
    }
    public void addStudent (Student student){
        students.add(student);
    }

    public void updateStudentInfo(int i,String name,Integer id){
        students.get(i).setName(name);
        students.get(i).setId(id);
    }

    public static double calculateAverageGrade(int i){
        double sum=0;
        int count=0;
        HashMap<String,Integer> grades =students.get(i).getGrades();
        for(int grade:grades.values()){
            sum+=grade;
            count++;
        }
        return sum/count;
    }
    public static void displayStudents(){
        int i=0;
        for(Student s:students){
            System.out.println("Name: "+s.getName());
            System.out.println("id: "+s.getId());
            System.out.println("Grades ");
            HashMap<String, Integer> grades = s.getGrades();
            for(String subject: grades.keySet()){
                System.out.println(subject+": "+grades.get(subject));
            }
            System.out.println("Average grade: "+calculateAverageGrade(i));
            i++;
        }
    }
    public static void main(String[] args) {
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 3));

        // Add some grades for Alice
        students.get(0).addGrade("Math", 90);
        students.get(0).addGrade("Science", 85);
        students.get(0).addGrade("History", 95);

        // Add some grades for Bob
        students.get(1).addGrade("Math", 80);
        students.get(1).addGrade("Science", 95);
        students.get(1).addGrade("History", 90);

        // Add some grades for Charlie
        students.get(2).addGrade("Math", 75);
        students.get(2).addGrade("Science", 80);
        students.get(2).addGrade("History", 85);

        displayStudents();
    }
}
