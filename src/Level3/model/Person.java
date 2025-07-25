package Level3.model;

public class Person {
    private String name;
    private String surname;
    private String dni;

    public Person(String name, String surname, String dni) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }

    public String getName() {return name;}
    public String getSurname() {return surname;}
    public String getDni() {return dni;}
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setDni(String dni) {this.dni = dni;}

    @Override
    public String toString() {
        return String.format("%-15s %-20s %-10s", name, surname, dni);
    }
}
