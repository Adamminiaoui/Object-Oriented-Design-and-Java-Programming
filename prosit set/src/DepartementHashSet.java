import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DepartementHashSet implements IDepartement<Departement> {

    private Set<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement d) {
        boolean added = departements.add(d);
        if (!added) {
            System.out.println("⚠️ Département déjà existant (id + nom identiques) : " + d);
        }
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equals(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        boolean removed = departements.remove(d);
        if (!removed) {
            System.out.println("❌ Département non trouvé : " + d);
        }
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParId() {
        // HashSet n'est pas trié → on copie dans une liste
        List<Departement> list = new ArrayList<>(departements);
        Collections.sort(list); // utilise compareTo() (par id)

        System.out.println("== Départements triés par ID ==");
        for (Departement d : list) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> list = new ArrayList<>(departements);

        Collections.sort(list, new Comparator<Departement>() {
            @Override
            public int compare(Departement d1, Departement d2) {
                int compareNom = d1.getNomDepartement()
                        .compareToIgnoreCase(d2.getNomDepartement());
                if (compareNom != 0)
                    return compareNom;

                return Integer.compare(d1.getNombreEmployes(), d2.getNombreEmployes());
            }
        });

        System.out.println("== Départements triés par nom et nombre d'employés ==");
        for (Departement d : list) {
            System.out.println(d);
        }
    }
}
