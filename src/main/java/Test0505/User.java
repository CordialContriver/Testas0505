package Test0505;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String surname;
    private String idNumber;

    public User(String name, String surname, String idNumber) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdNumber() {
        return idNumber;
    }
}
