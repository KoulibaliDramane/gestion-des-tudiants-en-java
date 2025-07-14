import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class students {

    public static void addStudent(){
        String cheminFichier = "src/students.csv";

        System.out.print("Nom : ");
        String name = Main.demanderALUtilisateur();

        System.out.print("Prénom : ");
        String surname = Main.demanderALUtilisateur();

        System.out.print("Classe : ");
        String classe = Main.demanderALUtilisateur();

        System.out.print("Matricule : ");
        String matricule = Main.demanderALUtilisateur();

        try (FileWriter writer = new FileWriter(cheminFichier, true)) { // true = mode ajout
            writer.append(name)
                    .append(",")
                    .append(surname)
                    .append(",")
                    .append(classe)
                    .append(",")
                    .append(matricule)
                    .append("\n");

            System.out.println("Étudiant ajouté avec succès !");
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture du fichier : " + e.getMessage());
        }
    }

    public static void readStudents(){
        String cheminFichier = "src/students.csv";

        try (BufferedReader lecteur = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                // Séparer les champs par virgule
                String[] champs = ligne.split(",");

                // Afficher les champs
                for (String champ : champs) {
                    System.out.print(champ + " | ");
                }
                System.out.println(); // nouvelle ligne
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }

}
