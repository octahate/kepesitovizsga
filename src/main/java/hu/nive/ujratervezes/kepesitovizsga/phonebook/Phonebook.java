package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    private static final String ILLEGAL_CHARACTERS = "[:\\\\\\\\/*?|<>]";

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (output == null || output.isBlank() || output.contains(ILLEGAL_CHARACTERS)) {
            throw new IllegalArgumentException("A fájlnév nem megfelelő!");
        }
        if (contacts == null) {
            throw new IllegalArgumentException("A telefonkönyv nem lehet null!");
        }
        Path path = Path.of(output);
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path))) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            throw new IllegalStateException("A fájl írása során hiba lépett fel!", e);
        }
    }
}
