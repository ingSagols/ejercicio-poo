package org.generation.entidades;

import java.util.ArrayList;

// 5.- Creamos una clase java para los cursos
public class Courses {
    String courseName;
    String profesorName;
    int year;
    ArrayList<Student> students;

    //Creamos el constructor para la clase
    public Courses(String courseName, String profesorName, int year) {
        this.courseName = courseName.toUpperCase();
        this.profesorName = profesorName.toUpperCase();
        this.year = year;
        this.students = new ArrayList<>();
    }//constuctor Courses

    // 5.- Implementamos los metodos para la clase
    public void enroll(Student student) {
        students.add(student);
    }//enroll

    public void enroll(Student[] students) {
        for (Student student : students) {
            this.enroll(student);
        }//forEach
    }//enroll

    public void unEnroll(Student student) {
        Student tempStudent = student;

        for(Student std : students) {
            if(tempStudent.equals(std)) {
                tempStudent = std;
                break;
            }//if
        }//forEach
        this.students.remove(tempStudent);
    }//unEnroll

    public int countStudents(){
        return this.students.size();
    }//countStudents

    public int bestGrade(){
        int max = 0;

        for(Student student : this.students){
            if(student.grade > max){
                max = student.grade;
            }//if
        }//forEach
        return max;
    }//bestGrade

    //Challenge yourself
    //First challenge
    public double average() {
        if (this.students.isEmpty()) {
            return 0.0;
        }
        double totalSum = 0;
        for (Student student : this.students) {
            totalSum += student.grade;
        }
        return totalSum / this.students.size();
    }//average

    //Second Challenge
    public void ranking() {
        ArrayList<Student> rankedStudents = new ArrayList<>(this.students);

        // Ordenamos usando Comparator.comparingInt de forma descendente
        rankedStudents.sort(java.util.Comparator.comparingInt((Student s) -> s.grade).reversed());

        System.out.println("Ranking del Curso: " + this.courseName);
        int position = 1;
        for (Student student : rankedStudents) {
            System.out.println(position + ". " + student.firstName + " " + student.lastName + " - Calificación: " + student.grade);
            position++;
        }
    }//ranking

    //Third Challenge
    public void isAboveAverage() {
        double avg = this.average();
        System.out.println("Estado actual con respecto al promedio: " + avg );

        for (Student student : this.students) {
            String status = (student.grade >= avg) ? "POR ENCIMA" : "POR DEBAJO";
            System.out.println(student.firstName + " " + student.lastName + ": " + status + " del promedio.");
        }
    }//isAboveAverage




    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", profesorName='" + profesorName + '\'' +
                ", year=" + year +
                ", students=" + students +
                '}';
    }
}//class Courses


