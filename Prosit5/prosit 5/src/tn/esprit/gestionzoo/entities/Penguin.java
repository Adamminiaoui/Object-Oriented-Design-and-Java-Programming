package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() {

    }

    public Penguin(String family, String name, int age, boolean mammal, String habitat, float swimmingDepth) {
        super(family, name, age, mammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }


    @Override
    public String toString() {
        return "Penguin{name=" + getName() +
                ", family=" + getFamily()+
                ", age=" + getAge() +
                ", mammal=" + isMammal()
                + ", habitat=" + getHabitat() +
                ", swimmingDepth=" + swimmingDepth + "}";
    }




}
