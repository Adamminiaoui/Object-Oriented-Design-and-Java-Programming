import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    public Departement() {
    }

    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                  // même référence
        if (o == null || getClass() != o.getClass()) // null ou classe différente
            return false;

        Departement that = (Departement) o;
        // égalité selon id + nomDepartement
        return id == that.id &&
                Objects.equals(nomDepartement, that.nomDepartement);
    }

    @Override
    public int hashCode() {
        // Style comme dans la présentation : utilisation de nombres premiers
        int hash = 7;
        hash = 17 * hash + id;
        hash = 31 * hash + Objects.hashCode(nomDepartement);
        return hash;
    }

    @Override
    public int compareTo(Departement d) {
        // tri naturel par id (croissant)
        return Integer.compare(this.id, d.id);
    }
}
