import java.util.ArrayList;
import java.util.Collections;

public class EspritArrayList implements University {

    private ArrayList <Etudiant> listeDesEtudiants;

    public EspritArrayList (){
        listeDesEtudiants= new ArrayList<>();
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
        System.out.println(listeDesEtudiants);
    }

    @Override
    public void trierEtudiantsParId() {

    }

    @Override
    public void trierEtudiantsParNom() {

    }


}
