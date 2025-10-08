package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;


    public Dolphin() {

    }

    public Dolphin(String family, String name, int age, boolean mammal,String habitat, float swimmingSpeed) {
        super(family, name, age, mammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }



    @Override
    public String toString() {
        return "Dolphin{name=" + getName() +
                ", family=" + getFamily()
                + ", age=" + getAge() +
                ", mammal=" + isMammal()
                + ", habitat=" + getHabitat() +
                ", swimmingSpeed=" + swimmingSpeed + "}";
    }





}
