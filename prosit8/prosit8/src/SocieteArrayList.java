import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<employe>,IRechercheAvancee<employe> {
    private List<employe> Listemployees;

    public SocieteArrayList() {
        Listemployees = new ArrayList<>();
    }


    @Override
    public void ajouterEmploye(employe e) {
        Listemployees.add(e);

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (employe e : Listemployees) {
            if (e.getNom().equals(nom))
                return true;

        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(employe e) {
        return Listemployees.contains(e);
    }

    @Override
    public void supprimerEmploye(employe e) {
        Listemployees.remove(e);

    }

    @Override
    public void displayEmploye() {
        for (employe e : Listemployees) {
            System.out.println(e);
        }

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(Listemployees);

    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(Listemployees, new Comparator<employe>() {
            @Override
            public int compare(employe e1, employe e2) {
                int compareNom = e1.getNom_depart().compareToIgnoreCase(e2.getNom_depart());
                if (compareNom != 0)
                    return compareNom;
                int compG= Integer.compare(e1.getGrade(), e2.getGrade());
                if (compG != 0) return compG;

                return e1.getNom_depart().compareToIgnoreCase(e2.getNom_depart());
            }
        });
    }


    @Override
    public List<employe> rechercherParDepartement(String nomDepartement) {
        List<employe> R =new ArrayList<>();
        for (employe e : Listemployees) {
            if (e.getNom_depart().equals(nomDepartement))
                R.add(e);
        }
        return R;
    }
}
