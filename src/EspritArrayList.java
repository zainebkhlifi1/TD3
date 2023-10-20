import java.util.ArrayList;
import java.util.Collections;


public class EspritArrayList implements University {

    private ArrayList <Etudiant> listeDesEtudiants;

    public EspritArrayList (){
        listeDesEtudiants= new ArrayList<Etudiant>();
    };

    public void ajouterEtudiant(Etudiant e){
        listeDesEtudiants.add(e);

    }
    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return listeDesEtudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        listeDesEtudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
      System.out.println("****"+listeDesEtudiants);
    }

    @Override
    public String toString() {
        return "EspritArrayList{" +
                "listeDesEtudiants=" + listeDesEtudiants +
                '}';
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(listeDesEtudiants);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(listeDesEtudiants, new TrieEtudiantParNom());

    }


}
