package Level1.Ex3.model;

import Level1.Ex3.utils.Input;
import Level1.Ex3.utils.ReadFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GameManagement {
    private HashMap <String,String> countries;
    private String name;
    private int punctuation;

    public GameManagement() {
        this.name = Input.readString("Type your username: ");
        this.countries = ReadFile.readFile();
        this.punctuation = 0;
    }
    public void startGame() {
        String randomCountry;
        String input;
        for (int i = 0 ; i < 10; i++) {
            randomCountry = selectRandomCountry();
            input = Input.readString("What is the capital of " + randomCountry + "? ");
            checkResponse(input, randomCountry);
        }
        putResponse();
        System.out.println("Game Over! Thank you for playing, " + this.name + "!");
    }

    public String selectRandomCountry() {
        ArrayList<String> keys = new ArrayList<>(this.countries.keySet());///
        Random random = new Random();
        String randomCountry = keys.get(random.nextInt(keys.size()));
        return (randomCountry);
    }

    public void checkResponse(String input, String country){
        if (this.countries.get(country).equalsIgnoreCase(input)) {
            this.punctuation++;
            System.out.println("Correct!");
        }
        else
            System.out.println("Wrong Answer:(");
    }

    public void putResponse(){
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/Level1/Ex3/scores.txt", true);
            writer.write(this.name + " " + this.punctuation + "\n");
            System.out.println("Your score is: " + this.punctuation);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the writer: " + e.getMessage());
                }
            }
        }
    }
}
