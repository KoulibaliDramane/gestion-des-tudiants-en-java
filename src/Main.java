import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        choixOption();
    }

    public static void menu() {
        System.out.println();
        System.out.println(" ---- MENU ----");
        System.out.println(" 1. Lister les étudiants");
        System.out.println(" 2. Ajouter un nouvel étudiant");
        System.out.println(" 3. Consulter les informations d'un étudiant");
        System.out.println(" 4. Supprimer un étudiant");
        System.out.println(" 0. Quitter");
    }

    public static String demanderALUtilisateur() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void choixOption() {
        while (true) {
            menu();
            System.out.println();
            System.out.print("Choisir une option entre 1 et 4 : ");
            String reponse = demanderALUtilisateur();
            int option;

            try {
                option = Integer.parseInt(reponse);
            } catch (NumberFormatException e) {
                System.out.println("Erreur : la chaîne n'est pas un nombre entier valide.");
                continue; // Redemande l'option
            }

            switch (option) {
                case 1:
                    System.out.println();
                    System.out.println("Option 1 : Lister les étudiants");
                    System.out.println();
                    students.readStudents();
                    continue;
                case 2:
                    System.out.println();
                    System.out.println("Option 2 : Ajouter un nouvel étudiant");
                    students.addStudent();
                    continue;
                case 3:
                    System.out.println("Option 3 : Consulter les informations d'un étudiant");
                    continue;
                case 4:
                    System.out.println("Option 4 : Supprimer un étudiant");
                    continue;
                case 0:
                    break;
                default:
                    System.out.println("Option incorrecte");
                    continue; // Redemande encore
            }

            break; // Option valide : sortir de la boucle
        }
    }
}
