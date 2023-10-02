package isp.lab6.exercise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExercise1 {


    @Test
    public void testRemoveStudent(){
        Exercise1 e1 = new Exercise1();
        Student A = new Student("Alice", 1);
        e1.addStudent(A);
        e1.removeStudent(0);


        assertEquals(0,e1.getStudents().size());

    }

    @Test
    public void testAddStudent() {
        Exercise1 e2 = new Exercise1();
        Student A2 = new Student("cosmin", 2);
        e2.addStudent(A2);
        int cnt2 = e2.getStudents().size();
        assertEquals(1, cnt2);
       e2.removeStudent(0);
    }

    @Test
    public void testUpdateStudentInformation(){
        Exercise1 e3 = new Exercise1();
        Student A = new Student("Matei", 3);
        e3.addStudent(A);

        e3.updateStudentInfo(0,"Jake",4);

        assertEquals("Jake",e3.getStudents().get(0).getName());
        e3.removeStudent(0);
    }
    @Test
    public void testCalculateAverage(){
        Exercise1 e3 = new Exercise1();
        Student A = new Student("Matei", 3);

        A.addGrade("Math", 80);
        A.addGrade("Science", 80);
        A.addGrade("History", 80);
        e3.addStudent(A);
        assertEquals(80,e3.calculateAverageGrade(0),0);
        e3.removeStudent(0);
    }
}