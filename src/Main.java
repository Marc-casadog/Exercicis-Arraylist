
import java.util.ArrayList;
import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    ArrayList<Float> notes = new ArrayList<Float>();

    float nota;

    System.out.println("Introdueix les notes:");
    do {
        nota = sc.nextFloat();
        if (nota != 0) {
            notes.add(nota);
        }

    } while (nota != 0);

    System.out.println("Notes dels alumnes:");
    for (int i = 0; i < notes.size(); i++) {
        System.out.println(notes.get(i));
    }
}
