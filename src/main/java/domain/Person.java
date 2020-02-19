package domain;

import com.google.gson.annotations.SerializedName;

public class Person {

    @SerializedName(value = "firstName", alternate = "first-name")
    String firstName;

    @SerializedName(value = "lastName", alternate = "last-name")
    String lastName;

    @SerializedName(value = "birthYear", alternate = "year")
    int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
