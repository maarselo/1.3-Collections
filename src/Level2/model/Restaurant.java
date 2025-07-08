package Level2.model;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{
    private String name;
    private int punctuation;

    public Restaurant(String name, int punctuation) {
        this.name = name;
        this.punctuation = punctuation;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Restaurant r = (Restaurant) o;
        return (getPunctuation() == r.getPunctuation() && (this.getName().equals(r.getName())));
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPunctuation());
    }

    @Override
    public String toString() {
        return "Restaurant{" + "name='" + name + '\'' + ", punctuation=" + punctuation + '}';
    }

    @Override
    public int compareTo(Restaurant r) {
        int compareName = this.name.compareTo(r.getName());
        if (compareName != 0)
            return compareName;
        return (Integer.compare(r.getPunctuation(), this.punctuation));
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getPunctuation() {return punctuation;}
    public void setPunctuation(int punctuation) {this.punctuation = punctuation;}
}
