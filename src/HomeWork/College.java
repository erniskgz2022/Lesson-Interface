package HomeWork;

import java.time.LocalDate;

public class College extends EducationCenter{

    public College() {
    }

    public College(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    @Override
    public String toString() {
        return "College{}" + super.toString();
    }
}
