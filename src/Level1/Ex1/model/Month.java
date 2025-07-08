package Level1.Ex1.model;

import java.util.Objects;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return Objects.equals(getName(), month.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
