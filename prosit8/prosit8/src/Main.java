import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList socite = new SocieteArrayList();

        employe em1 = new employe(1, "Ali", "Mansour", "Informatique", 3);
        employe em2= new employe(2, "ahmed", "Mansour", "Informatique", 4);
        employe em3= new employe(3, "doua", "khemiri", "Informatique", 5);
        employe em4= new employe(4, "darine", "Mansour", "genie_cevil", 6);
        employe em5=new employe(5, "rayen", "abidi", "genie_cevil", 7);

        socite.ajouterEmploye(em1);
        socite.ajouterEmploye(em2);
        socite.ajouterEmploye(em3);
        socite.ajouterEmploye(em4);
        socite.ajouterEmploye(em5);

        System.out.println("la liste des employees ; ");
        socite.displayEmploye();





        System.out.println("\n Tri par ID :");
        socite.trierEmployeParId();
        socite.displayEmploye();

        System.out.println("\n Tri par Département et Grade  et Nom:");
        socite.trierEmployeParNomDepartementEtGrade();
        socite.displayEmploye();

        System.out.println("\n=== Recherche avancée : département 'Informatique' ===");
        List<employe> informatique=socite.rechercherParDepartement("Informatique");
        for (employe e : informatique) {
            System.out.println(e);

        }

    }
}
