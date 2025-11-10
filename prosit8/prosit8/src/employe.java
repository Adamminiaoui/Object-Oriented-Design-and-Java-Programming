import java.util.Objects;

public class employe implements Comparable<employe> {
    int id;
    String nom;
    String prenom;
    String nom_depart;
    int grade;

    public employe() {
    }

    public employe(int id, String nom, String prenom, String nom_depart, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_depart = nom_depart;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom_depart() {
        return nom_depart;
    }

    public void setNom_depart(String nom_depart) {
        this.nom_depart = nom_depart;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom_depart='" + nom_depart + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        employe employe = (employe) o;
        return id == employe.id && Objects.equals(nom, employe.nom);
    }


    @Override
    public int compareTo(employe e) {
        return Integer.compare(this.id, e.id);
    }
}
