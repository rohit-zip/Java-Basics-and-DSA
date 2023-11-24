package jdbc;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - jdbc
 * Created_on - 24 November-2023
 * Created_at - 21 : 23
 */

public class Entity {
    /**
     *
     * MySql -> table or row
     * Entity or Modal -> Fields will act as a Column
     */

    // int, long, float, double, boolean, String, array
    private int id;
    private String name;
    private String email;
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Entity(int id, String name, String email, String username) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.username = username;
    }

    public Entity() {
    }
}
