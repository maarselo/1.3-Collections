package Level3.services;

import Level3.model.Person;
import Level3.utils.Input;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class ManagePeople {
    private static final String file = "src/Level3/people.csv";
    private ArrayList<Person> people;

    public ManagePeople() {
        this.people = new ArrayList<>();
    }

    public void loadFile(){
        String line;
        String []words;
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            while ((line = br.readLine()) != null) {
                line = line.trim();
                words = line.split(",");
                if (words.length == 3)
                    this.people.add(new Person(words[0], words[1], words[2]));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addPerson() {
        String name = Input.readNames("What it's your name? ");
        String surname = Input.readNames("What it's your surname? ");
        String dni = Input.readDni("what it's your dni? ");
        people.add(new Person(name, surname, dni));
        uploadFile();
        System.out.println("The person was added successfully :)");
    }

    public void uploadFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))){
            for (Person p : this.people) {
                writer.println(p.getName() + "," + p.getSurname() + "," + p.getDni());
            }
        } catch (IOException e) {
            System.err.println("Error while we are updating the file.");
        }
    }

    public void showSorted(Comparator<Person> comparator){
        System.out.printf("%-15s %-20s %-10s\n", "NAME", "SURNAME", "DNI");
        people.stream()
                .sorted(comparator)
                .forEach(System.out::println);
        System.out.println();
    }
}
