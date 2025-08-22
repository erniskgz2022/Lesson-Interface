package Lesson_Interface.HomeWork;



import Lesson_Interface.HomeWork.Servicelmpl.Student;
import Lesson_Interface.HomeWork.Servicelmpl.Student;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        EducationCenter[] educationCenters = {
                new School("nurmanbetov - 16","KGZ",LocalDate.of(2000,4,5)),
                new School("№ -5 ","Rs",LocalDate.of(2005,4,6)),
                new University("Aloo-Too","KGZ",LocalDate.of(1999,4,2)),
                new University("MUKR","KGZ",LocalDate.of(1993,8,6)),
                new University("Manas","KGZ",LocalDate.of(1992,4,1)),
                new University("KTU","KGZ",LocalDate.of(1965,3,6)),
                new College("KTU","KGZ",LocalDate.of(1994,4,6)),
                new College("Manas","KGZ",LocalDate.of(1965,3,6)),
                new College("MUKR","KGZ",LocalDate.of(1974,3,5)),
                new College("Arabaeva","KGZ",LocalDate.of(1980,4,7))
        };

        Student[] students = new Student[10];
        students[0] = new Student("Aibek", "Toktomamatov", "Male", LocalDate.of(2020, 9, 1), educationCenters[0]);
        students[1] = new Student("Aizada", "Bekova", "Female", LocalDate.of(2019, 9, 1), educationCenters[1]);
        students[2] = new Student("Nursultan", "Omurov", "Male", LocalDate.of(2021, 9, 1), educationCenters[2]);
        students[3] = new Student("Meerim", "Asanova", "Female", LocalDate.of(2022, 9, 1),educationCenters[3]);
        students[4] = new Student("Ruslan", "Kubanychbekov", "Male", LocalDate.of(2020, 9, 1), educationCenters[4]);
        students[5] = new Student("Aigul", "Sadykova", "Female", LocalDate.of(2018, 9, 1), educationCenters[5]);
        students[6] = new Student("Bakyt", "Erkinov", "Male", LocalDate.of(2021, 9, 1), educationCenters[6]);
        students[7] = new Student("Saltanat", "Tursunova", "Female", LocalDate.of(2019, 9, 1), educationCenters[7]);
        students[8] = new Student("Adilet", "Samatov", "Male", LocalDate.of(2022, 9, 1), educationCenters[8]);
        students[9] = new Student("Gulnara", "Abdykadyrova", "Female", LocalDate.of(2020, 9, 1),educationCenters[9]);

        for (Student student : students) {
            student.getInfoStudent();
            student.getStudentEducationCenter();
            student.getStudentsStudentYear();
        }
    }


}
