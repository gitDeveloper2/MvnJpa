package main;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class person {
    @Id
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }


    public String String() {
        return "person{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
