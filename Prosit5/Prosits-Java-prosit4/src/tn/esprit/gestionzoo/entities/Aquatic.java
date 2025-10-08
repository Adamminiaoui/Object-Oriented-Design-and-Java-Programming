package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatic extends Animal {
    private String habitat;

    public Aquatic() {

    }

    public Aquatic(String family, String name, int age, boolean mammal, String habitat) {
        super(family, name, age, mammal);
        this.habitat = habitat;
    }

    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = habitat; }

    @Override
    public String toString() {
        return "Aquatic{name=" + getName() +
                ", family=" + getFamily() +
                ", age=" + getAge() +
                ", mammal=" + isMammal() +
                ", habitat=" + habitat + "}";
    }
}
