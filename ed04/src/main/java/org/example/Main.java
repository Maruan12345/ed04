package org.example;
/**
 * Mi trabajo
 * @author  Maruan
 * @version 1.0
 * @since 7/03/2024
 * @see -
 */
public class Main {
    public static void main(String[] args) {
        // Crear una nueva agenda.
        Agenda agendaCambiada = new Agenda();

        // Añadir contactos a la agenda.
        agendaCambiada.addContact("John Doe", "1234567890");
        agendaCambiada.addContact("Jane Doe", "9876543210");
        agendaCambiada.addContact("Mary Jane", "1122334455");

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Contacto c : agendaCambiada.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }

        // Añadir un nuevo teléfono a un contacto existente.
        agendaCambiada.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        agendaCambiada.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        agendaCambiada.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Contacto c : agendaCambiada.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }
}