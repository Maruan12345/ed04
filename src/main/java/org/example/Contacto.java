package org.example;
/**
 * Mi trabajo
 * @author Maruan
 * @version 1.0
 * @since 7/03/2024
 * @see Agenda
 */
import java.util.ArrayList;
import java.util.List;

class Contacto {
    private String name;
    private List<String> phones;

    public Contacto(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}