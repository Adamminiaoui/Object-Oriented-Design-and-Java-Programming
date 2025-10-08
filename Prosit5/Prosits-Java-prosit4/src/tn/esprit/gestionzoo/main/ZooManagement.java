package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        //System.out.println(myZoo.addAnimal(lion));
        //System.out.println(myZoo.addAnimal(dog));

        //myZoo.displayAnimals();

        //System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        //System.out.println(myZoo.searchAnimal(dog2));

          //System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        //System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        //myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        //System.out.println(notMyZoo1);

        Aquatic a = new Aquatic();
        Terrestrial t = new Terrestrial();
        Dolphin d = new Dolphin();
        Penguin p = new Penguin();

        System.out.println(a);
        System.out.println(t);
        System.out.println(d);
        System.out.println(p);


        Aquatic aa = new Aquatic("fish", "houta", 10, false, "bhar");
        Terrestrial tt = new Terrestrial("x", "simba", 20, true, 4);
        Dolphin dd   = new Dolphin("delphin", "dophi", 5, true, "bhar", 10.5f);
        Penguin pp   = new Penguin("batrik", "batrik", 3, false, "bhar", 5.6f);

        System.out.println(aa);
        System.out.println(tt);
        System.out.println(dd);
        System.out.println(pp);
    }

}

