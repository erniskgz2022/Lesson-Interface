package Lesson_Interface.HomeWork;

import java.time.LocalDate;

public class School extends EducationCenter{
    public School() {
    }

    public School(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    @Override
    public String toString() {
        return "School{}" + super.toString();
    }
}
