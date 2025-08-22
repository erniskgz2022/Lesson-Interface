package Lesson_Interface.HomeWork;

import java.time.LocalDate;

public class University extends EducationCenter{

    public University() {
    }

    public University(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    @Override
    public String toString() {
        return "University{}" + super.toString();
    }
}
