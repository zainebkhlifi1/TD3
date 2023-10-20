// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        EspritArrayList e = new EspritArrayList();
        Etudiant e1=new Etudiant(9,"zaineb","khlifi");
        Etudiant e2=new Etudiant(10,"hjk","mlp");
        Etudiant e3=new Etudiant(11,"hjk","mlp");

       // System.out.println(e1.equals(e2));

         e.ajouterEtudiant(e1);
        e.ajouterEtudiant(e2);
        e.ajouterEtudiant(e3);
        e.displayEtudiants();
        e.trierEtudiantsParId();

        e.trierEtudiantsParNom();








    }
}