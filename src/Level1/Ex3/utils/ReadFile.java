package Level1.Ex3.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadFile {
    public static HashMap<String, String> readFile() {
        HashMap<String, String> countries = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/Level1/Ex3/countries.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String []words = line.split(" ");
                if (words.length >= 2)
                    countries.put(words[0],words[1]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return (countries);
    }
}
