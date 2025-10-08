package tn.esprit.gestionzoo.entities;

public final class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial() {

    }
    public Terrestrial(String family, String name, int age, boolean mammal, int nbrLegs) {
        super(family, name, age, mammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }
    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{name=" + getName() +
                ", family=" + getFamily()+
                ", age=" + getAge() +
                ", mammal=" + isMammal()+
                 ", nbrLegs=" +
                nbrLegs + "}";
    }
}
