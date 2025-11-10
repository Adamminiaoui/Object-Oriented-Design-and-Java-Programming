public class Main {
    public static void main(String[] args) {
        SocieteArrayList socite = new SocieteArrayList();

        employe em1 = new employe(1, "Ali", "Mansour", "Informatique", 3);
        employe em2= new employe(2, "ahmed", "Mansour", "Informatique", 4);
        employe em3= new employe(3, "doua", "khemiri", "Informatique", 5);

        socite.ajouterEmploye(em1);
        socite.ajouterEmploye(em2);
        socite.ajouterEmploye(em3);

        System.out.println("la liste des employees ; ");
        socite.displayEmploye();

        System.out.println("\n🔎 Recherche par nom 'Ali' : " + socite.rechercherEmploye("Ali"));
        System.out.println("🔎 Recherche par objet e2 : " + socite.rechercherEmploye(em2));

        System.out.println("\n Suppression de e2...");
        socite.supprimerEmploye(em2);
        socite.displayEmploye();

        System.out.println("\n Tri par ID :");
        socite.trierEmployeParId();
        socite.displayEmploye();

        System.out.println("\n Tri par Département et Grade :");
        socite.trierEmployeParNomDepartementEtGrade();
        socite.displayEmploye();

    }
}
