package main;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(query = "select p from person p where p.id=:id",name = "find by id")
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
