import java.util.Comparator;

    public class TrieEtudiantParNom implements Comparator<Etudiant> {
        @Override
        public int compare(Etudiant o1, Etudiant o2) {
            return o1.getNom().compareTo(o2.getNom());
        }
    }

