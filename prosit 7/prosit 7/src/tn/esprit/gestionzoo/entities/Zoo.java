package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exception.InvalidAgeException;
import tn.esprit.gestionzoo.exception.ZooFullException;

public class Zoo {

    public static final int NUMBER_OF_CAGES = 2;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int nbrAquaticAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public void addAnimal(Animal animal) throws ZooFullException , InvalidAgeException {
        if (isZooFull()) {
            throw new ZooFullException();
        }

        if (animal.getAge() < 0) {
            throw new InvalidAgeException();
        }
        if (searchAnimal(animal) == -1) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
        } else {
            System.out.println("Animal already exists in the zoo.");
        }
    }
    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Zoo{ Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals + "}";
    }
    public boolean addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals >= aquaticAnimals.length) {
            System.out.println("The aquatic area is full!");
            return false;
        }
        aquaticAnimals[nbrAquaticAnimals++] = aquatic;
        return true;

    }
    public void displayAquaticAnimals() {
        System.out.println("List of aquatic animals in the zoo:");
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            System.out.println(" - " + aquaticAnimals[i]);
        }
    }
    public void makeAquaticsSwim() {
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinDepth() {
        float max = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > max)
                    max = p.getSwimmingDepth();
            }
        }
        return max;
    }

    public void displayAquaticCountByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphinCount++;
            if (aquaticAnimals[i] instanceof Penguin) penguinCount++;
        }
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }


}
