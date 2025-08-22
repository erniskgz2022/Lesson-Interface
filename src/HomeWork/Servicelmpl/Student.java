package HomeWork.Servicelmpl;



import HomeWork.EducationCenter;
import HomeWork.Study;

import java.time.LocalDate;

public class Student implements Study {
    private String name;
    private String surName;
    private String gender;
    private LocalDate dateOfStart;
    EducationCenter educationCenter;

    public Student() {
    }

    public Student(String name, String surName, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    public void getInfoStudent(){
        System.out.println(
                " ------------------------Student info----------------------------" + "\n" +
                "Name:  " + name + '\n' +
                "Surname: " + surName + '\n' +
                "Gender: " + gender + '\n' +
                "localDate Date Of Start: " + dateOfStart 
                );
    }

    @Override
    public void getStudentEducationCenter() {
        System.out.println("Студент окуган окуу борбору: " + educationCenter.getName() + "\n" +
                "Education Center Country: " + educationCenter.getLocatedCountry() + '\n' +
                "Education Center FoundationData: " + educationCenter.getFoundationYear());
    }

    @Override
    public void getStudentsStudentYear() {
        int years = LocalDate.now().getYear() - getDateOfStart().getYear();
        System.out.println("Студент окуп жаткан жылы: " + years + "\n");
    }



}
