package org.generation.entidades;
//2.- Creamos la clase student dentro de un package entidades

public class Student {

    //2.- Definimos los atributos de la clase
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    //4.- Creamos 3 constructores

    // Constructor 1: recibe todos los parametros
    public Student (String firstName, String lastName,int registration, int grade, int year) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }//constructor1

    // Constructor 2: recibe firstName, lastName y id
    public Student(String firstName, String lastName, int registration, int grade) {
        this(firstName, lastName, registration, grade, 1);
    }//constructor2

    // Constructor 3: recibe firstName, lastName, id y registration
    public Student (String firstName, String lastName){
        this(firstName, lastName, 2026, 0, 1);
    }//constructor3


    // 3.- Implementamos metodos.
    public void printFullName(){
        System.out.println("First Name: " + this.firstName + ", Last Name: " + lastName);
    }//printFullName

    public boolean isApproved(){
       if(this.grade < 60){
           return false;
       }//if
           return true;
    }//isApproved

    public int changeYearIfApproved(){
        if(isApproved()){
            this.year += 1;
            System.out.println("Congratulations. Promoted to year: " + this.year);
        } else {
            System.out.println("Better Luck next time.");
        }//else
        return this.year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registration=" + registration +
                ", grade=" + grade +
                ", year=" + year +
                '}';
    }//toString
}//classStudent

/*
 //Atributos que solo requieren Getters ( firstName, lastName y registration)

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRegistration() {
        return registration;
    }

    //Atributos con Getters y Setters ( grade y year)
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade >= 0 && grade <= 100) {
            this.grade = grade;
        }else {
            System.out.println("> Error. Debe ser una calificación entre 0 y 100");
        }//else
    }//setGrade

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
 */
