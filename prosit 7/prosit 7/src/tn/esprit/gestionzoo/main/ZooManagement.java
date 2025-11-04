package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exception.InvalidAgeException;
import tn.esprit.gestionzoo.exception.ZooFullException;

public class ZooManagement {

    public static void main(String[] args) throws ZooFullException {
        //Animal lion = new Animal();
        //lion.setName("Simba");
        //lion.setAge(8);
        //lion.setFamily("Cats");
        //lion.setMammal(true);

        //Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        //Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


       // Animal dog = new Animal("Canine", "Snoopy", 2, true);


        //System.out.println(myZoo.addAnimal(lion));
        //System.out.println(myZoo.addAnimal(dog));

        //myZoo.displayAnimals();

        //System.out.println(myZoo.searchAnimal(dog));
        //Animal dog2 = new Animal("Canine", "lll", 2, true);
        //System.out.println(myZoo.searchAnimal(dog2));

          //.out.println(myZoo.removeAnimal(dog));
       /* myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        System.out.println("-------------------------------------------------------");
        Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);


        //System.out.println(aquatic);
        //System.out.println(terrestrial);
        //.out.println(dolphin);
        //System.out.println(penguin);



        aquatic.swim();
        dolphin.swim();
        penguin.swim();




        System.out.println("Adding aquatic animals to the zoo");

        myZoo.addAquaticAnimal(aquatic);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        myZoo.displayAquaticAnimals();

        myZoo.makeAquaticsSwim();

        System.out.println("Maximum penguin depth: " + myZoo.maxPenguinDepth());

        myZoo.displayAquaticCountByType();
        */

         Zoo myZooo = new Zoo("Wildlife Park", "Ariana");
        Animal kalb = new Animal("bergé", "rex", -1, true);
        Animal test1 = new Animal("bergé", "mohamed", 2, true);
        Animal test2 = new Animal("bergé", "xxx", 2, true);
        Animal test3 = new Animal("bergé", "test", 2, true);


        try {
            myZooo.addAnimal(kalb);
            myZooo.addAnimal(test1);
            myZooo.addAnimal(test2);
            myZooo.addAnimal(test3);
        } catch (ZooFullException e) {
            System.out.println("error"+ e.getMessage());
        }
        catch (InvalidAgeException i) {
            System.out.println("error"+ i.getMessage());
        }
        System.out.println("test catch");

    }

}
