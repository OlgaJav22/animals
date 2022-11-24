package animals;

public class Animals {
    private String name;
    private int age;

    public Animals (String name, int age) {
        setName(name);
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }


}
