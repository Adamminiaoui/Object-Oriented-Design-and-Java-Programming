public class Main {
    public static void main(String[] args) {

        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "HR", 5);
        Departement d3 = new Departement(3, "Comptabilite", 7);
        Departement d4 = new Departement(1, "Marketing", 12); // même id + nom → doublon

        System.out.println("➕ Ajout des départements :");
        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);
        gestion.ajouterDepartement(d4); // doit être refusé par le HashSet

        System.out.println("\n  Liste des départements :");
        gestion.afficherDepartements();

        System.out.println("\n  Recherche par nom 'Informatique' : "
                + gestion.rechercherDepartement("Informatique"));

        System.out.println("  Recherche par objet d2 : "
                + gestion.rechercherDepartement(d2));

        System.out.println("\n Suppression de d2 (RH)...");
        gestion.supprimerDepartement(d2);

        System.out.println("\n Liste après suppression :");
        gestion.afficherDepartements();

        System.out.println("\n Tri par ID :");
        gestion.trierDepartementsParId();

        System.out.println("\n Tri par nom et nombre d'employés :");
        gestion.trierDepartementsParNomEtNombreEmployes();
    }
}
