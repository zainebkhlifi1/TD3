public class Etudiant {
   int id ;
   String nom;
   String prenom;

    public Etudiant(){}
    public Etudiant(int id ,String nom,String prenom){
       this.id=id;
       this.nom=nom;
       this.prenom=prenom;
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null) return false;
        if(obj.getClass()!=this.getClass())
            return false;

        Etudiant etd=(Etudiant) obj;
        if(etd.id==id )
            return true;
        return false;
    }


    public String toString() {
return ( "nom"+this.nom+"id"+this.id+"prenom"+prenom);
    }











}
