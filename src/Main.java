
import java.util.ArrayList;
import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    ArrayList<Float> notesAlumnes = new ArrayList<>();
    ArrayList<String> nomsAlumnes = new ArrayList<>();

    int opcio;
    int posicio;
    float nota;
    String nom;

    do {

        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Introduir nota");
        System.out.println("2. Consultar nota");
        System.out.println("3. Eliminar una nota");
        System.out.println("4. Modificar una nota");
        System.out.println("5. Sortir");
        System.out.print("Escull una opcio: ");

        opcio = sc.nextInt();

        switch (opcio) {
            1case 1:

                System.out.print("Introdueix el nom de l'alumne: ");
                nom = sc.next();

                System.out.print("Introdueix la nota: ");
                nota = sc.nextFloat();

                if (nota >= 0 && nota <= 10) {
                    nomsAlumnes.add(nom);
                    notesAlumnes.add(nota);

                    System.out.println("Alumne i nota afegits.");
                } else {
                    System.out.println("Nota incorrecta.");
                }

                break;

            case 2:

                System.out.print("Introdueix la posicio: ");
                posicio = sc.nextInt();

                if (posicio >= 0 && posicio < notesAlumnes.size()) {
                    System.out.println("Alumne: " + nomsAlumnes.get(posicio));
                    System.out.println("Nota: " + notesAlumnes.get(posicio));
                } else {
                    System.out.println("Posicio incorrecta.");
                }

                break;

            case 3:

                System.out.print("Introdueix la posicio: ");
                posicio = sc.nextInt();

                if (posicio >= 0 && posicio < notesAlumnes.size()) {
                    nomsAlumnes.remove(posicio);
                    notesAlumnes.remove(posicio);

                    System.out.println("Alumne i nota eliminats.");
                } else {
                    System.out.println("Posicio incorrecta.");
                }

                break;

            case 4:

                System.out.print("Introdueix la posicio: ");
                posicio = sc.nextInt();

                if (posicio >= 0 && posicio < notesAlumnes.size()) {

                    System.out.print("Introdueix la nova nota: ");
                    nota = sc.nextFloat();

                    if (nota >= 0 && nota <= 10) {
                        notesAlumnes.set(posicio, nota);

                        System.out.println("Nota modificada.");
                    } else {
                        System.out.println("Nota incorrecta.");
                    }

                } else {
                    System.out.println("Posicio incorrecta.");
                }

                break;

            case 5:

                System.out.println("Has sortit");

                break;

            default:

                System.out.println("Opcio incorrecta.");
        }
    } while (opcio != 5);

}
