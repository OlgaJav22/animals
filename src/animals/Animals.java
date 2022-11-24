package animals;

public class Animals {
    private String nameAnimals;
    private int ageAnimals;

    public Animals (String nameAnimals, int ageAnimals) {
        setNameAnimals(nameAnimals);
        if (ageAnimals > 0) {
            this.ageAnimals = ageAnimals;
        } else {
            this.ageAnimals = 0;
        }
    }

    public void go() {

    }

    public void sleep() {

    }

    public void eat () {

    }

    public String getNameAnimals() {
        return nameAnimals;
    }

    public void setNameAnimals(String nameAnimals) {
        if (nameAnimals != null && !nameAnimals.isBlank() && !nameAnimals.isEmpty()) {
            this.nameAnimals = nameAnimals;
        }
    }

    public int getAge() {
        return ageAnimals;
    }


}
