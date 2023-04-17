package com.example.labs.AppStudentsAndMarks;

import java.util.*;

public class StudentsAndMarks {

    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Acki", 1231);
        Student student2 = new Student("Anna", "Becki", 1232);
        Student student3 = new Student("Aleksandra", "Cecki", 1233);
        Student student4 = new Student("Tomasz", "Decki", 1234);
        Student student5 = new Student("Grzegorz", "Fecki", 1235);

        ArrayList<Integer> student1Marks = new ArrayList<>(Arrays.asList(3, 3, 4, 4, 4, 5, 5, 5, 6, 5));
        ArrayList<Integer> student2Marks = new ArrayList<>(Arrays.asList(2, 3, 3, 4, 6, 5, 5, 5, 6, 5));
        ArrayList<Integer> student3Marks = new ArrayList<>(Arrays.asList(5, 5, 5, 4, 5, 5, 5, 5, 6, 5));
        ArrayList<Integer> student4Marks = new ArrayList<>(Arrays.asList(3, 3, 4, 4, 1, 2, 1, 3, 1, 1));
        ArrayList<Integer> student5Marks = new ArrayList<>(Arrays.asList(3, 3, 1, 4, 3, 5, 5, 5, 6, 2));

        HashMap<Student, List<Integer>> studentsAndMarks = new HashMap<>();
        studentsAndMarks.put(student1, student1Marks);
        studentsAndMarks.put(student2, student2Marks);
        studentsAndMarks.put(student3, student3Marks);
        studentsAndMarks.put(student4, student4Marks);
        studentsAndMarks.put(student5, student5Marks);

        Student student = new Student();
        student.calculateAverageMarksForEachStudent(studentsAndMarks);
    }
}

class Student {
    String firstName;
    String surname;
    Integer studentId;

    public Student() {
    }

    public Student(String firstName, String surname, Integer studentId) {
        this.firstName = firstName;
        this.surname = surname;
        this.studentId = studentId;
    }

    public void calculateAverageMarksForEachStudent(HashMap<Student, List<Integer>> studentsAndMarks) {
        for (Map.Entry<Student, List<Integer>> student : studentsAndMarks.entrySet()) {
            String marksAverage = String.format("%.2f", calculateAverage(student.getValue()));
            System.out.println(student.getKey().toString(marksAverage));
        }
    }

    private Double calculateAverage(List<Integer> marks) {
        Double sum = 0.00;
        for (int i = 0; i < marks.size(); i++) {
            sum += marks.get(i);
        }
        return sum / marks.size();
    }

    public String toString(String marksAverage) {
        return "Student: firstName: " + firstName + ", surname: " + surname + ", studentId: " + studentId + ", marksAverage: " + marksAverage + "}";
    }
}

