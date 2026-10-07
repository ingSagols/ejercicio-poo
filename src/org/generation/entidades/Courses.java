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
}//class Courses


