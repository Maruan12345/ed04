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
    private String persona;
    private List<String> phones;

    public Contacto(String persona, String phone) {
        this.setPersona(persona);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    public String getPersona() {
        return this.persona;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}