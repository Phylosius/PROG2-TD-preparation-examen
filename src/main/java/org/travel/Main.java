package org.travel;
import org.travel.Entity.Personne;
import org.travel.Entity.Voyageur;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Voyageur john = new Voyageur("John", "Doe", "ta gueul", "2000-01-01", 75d, "2024-10-01");
        System.out.println(john.getAge());
    }
}